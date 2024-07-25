package org.dromara.aimer.service.service.bilibili.impl;

import org.dromara.aimer.service.service.bilibili.BilibiliService;
import org.dromara.aimer.service.service.bilibili.dto.LoginInfoDTO;
import org.dromara.aimer.service.service.bilibili.dto.LoginResultDTO;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BilibiliServiceImpl implements BilibiliService {

    @Override
    public LoginResultDTO login(LoginInfoDTO loginInfoDTO) {
        if (Objects.isNull(loginInfoDTO)) {
            return null;
        }
        return null;
    }
}
