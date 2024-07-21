package org.dromara.aimer.integration.bilibili.login.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class GenerateQrCodeResult {

    /**
     * 二维码内容 (登录页面 url)
     */
    private String url;

    /**
     * 扫码登录秘钥
     * 恒为32字符
     */
    private String qrcodeKey;
}
