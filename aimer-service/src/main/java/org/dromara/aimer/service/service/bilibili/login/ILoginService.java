package org.dromara.aimer.service.service.bilibili.login;

import org.dromara.aimer.service.enums.LoginTypeEnum;
import org.dromara.aimer.service.service.bilibili.dto.LoginInfoDTO;
import org.dromara.aimer.service.service.bilibili.dto.LoginResultDTO;

public interface ILoginService {

    LoginResultDTO login(LoginInfoDTO loginInfoDTO);

    LoginTypeEnum supportedLoginType();
}
