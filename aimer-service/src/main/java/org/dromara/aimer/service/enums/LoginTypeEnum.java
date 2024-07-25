package org.dromara.aimer.service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LoginTypeEnum {

    PASSWORD(0, "账号密码登录"),

    EMAIL(1, "邮件登录"),

    COOKIE(2, "Cookie登录"),

    ;

    private final Integer code;

    private final String desc;
}
