package org.dromara.aimer.service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SexEnum {

    UN_KNOWN(0, "未知"),

    MALE(1, "男性"),

    FEMALE(2, "女性"),

    ;

    private final Integer code;

    private final String desc;
}
