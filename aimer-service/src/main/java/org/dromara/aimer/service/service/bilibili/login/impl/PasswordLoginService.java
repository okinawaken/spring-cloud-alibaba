package org.dromara.aimer.service.service.bilibili.login.impl;

import org.dromara.aimer.service.enums.LoginTypeEnum;
import org.dromara.aimer.service.service.bilibili.dto.LoginInfoDTO;
import org.dromara.aimer.service.service.bilibili.dto.LoginResultDTO;
import org.dromara.aimer.service.service.bilibili.login.ILoginService;
import org.springframework.stereotype.Service;

@Service
public class PasswordLoginService implements ILoginService {
    @Override
    public LoginResultDTO login(LoginInfoDTO loginInfoDTO) {
        return null;
    }

    @Override
    public LoginTypeEnum supportedLoginType() {
        return null;
    }
}
