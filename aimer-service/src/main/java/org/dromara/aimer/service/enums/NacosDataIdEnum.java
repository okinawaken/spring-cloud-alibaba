package org.dromara.aimer.service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author bixiu
 */

@Getter
@AllArgsConstructor
public enum NacosDataIdEnum {

    MYBATIS_PLUS_GENERATOR_CONFIG("mybatis-plus-generator-config.json", "mybatis-plus代码生成器配置"),
    ;

    private final String dataId;

    private final String desc;
}
