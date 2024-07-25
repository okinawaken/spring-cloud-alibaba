package org.dromara.aimer.service.service.bilibili.dto;

import lombok.Data;
import org.dromara.aimer.service.enums.LoginTypeEnum;

@Data
public class LoginInfoDTO {

    private String username;

    private String password;

    private String email;

    private String verificationCode;

    private String qrCode;

    private String cookie;

    private LoginTypeEnum loginType;
}
