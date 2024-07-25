package org.dromara.aimer.service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PlatFormTypeEnum {

    BILIBILI(0, "哔哩哔哩"),

    ;

    private final Integer code;

    private final String desc;
}
