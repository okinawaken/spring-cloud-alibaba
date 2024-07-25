package org.dromara.aimer.service.service.bilibili.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class WebKeyResult {

    /**
     * 密码盐值
     * 有效时间为 20s
     * 恒为 16 字符
     * 需要拼接在明文密码之前
     */
    private String hash;

    /**
     * rsa 公钥
     * PEM 格式编码
     * 加密密码时需要使用
     */
    private String key;
}
