package org.dromara.aimer.service.service.bilibili.login.impl;

import org.dromara.aimer.common.response.BaseResponse;
import org.dromara.aimer.service.enums.LoginTypeEnum;
import org.dromara.aimer.service.service.bilibili.dto.LoginInfoDTO;
import org.dromara.aimer.service.service.bilibili.dto.LoginResultDTO;
import org.dromara.aimer.service.service.bilibili.login.ILoginService;
import org.dromara.aimer.service.service.bilibili.sdk.WebQrLoginService;
import org.dromara.aimer.service.service.bilibili.sdk.response.QrCodePollResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QrLoginService implements ILoginService {

    @Autowired
    private WebQrLoginService webQrLoginService;

    @Override
    public LoginResultDTO login(LoginInfoDTO loginInfoDTO) {
        BaseResponse<QrCodePollResult> loginResult = webQrLoginService.pollQRCode(loginInfoDTO.getQrCode());
        return null;
    }

    @Override
    public LoginTypeEnum supportedLoginType() {
        return LoginTypeEnum.QR;
    }
}
