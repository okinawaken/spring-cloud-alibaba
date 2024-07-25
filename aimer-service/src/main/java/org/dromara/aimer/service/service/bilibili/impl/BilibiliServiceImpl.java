package org.dromara.aimer.service.service.bilibili.impl;

import org.dromara.aimer.service.enums.LoginTypeEnum;
import org.dromara.aimer.service.service.bilibili.BilibiliService;
import org.dromara.aimer.service.service.bilibili.dto.LoginInfoDTO;
import org.dromara.aimer.service.service.bilibili.dto.LoginResultDTO;
import org.dromara.aimer.service.service.bilibili.login.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class BilibiliServiceImpl implements BilibiliService {

    @Autowired
    private ApplicationContext applicationContext;

    private final Map<LoginTypeEnum, ILoginService> LOGIN_SERVICE_MAP = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        Map<String, ILoginService> beansOfType = applicationContext.getBeansOfType(ILoginService.class);
        for (ILoginService loginService : beansOfType.values()) {
            LOGIN_SERVICE_MAP.put(loginService.supportedLoginType(), loginService);
        }
    }

    @Override
    public LoginResultDTO login(LoginInfoDTO loginInfoDTO) {
        ILoginService loginService = LOGIN_SERVICE_MAP.get(loginInfoDTO.getLoginType());
        return loginService.login(loginInfoDTO);
    }
}
