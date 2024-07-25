package org.dromara.aimer.integration.bilibili.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SendSmsResult {

    /**
     * 短信登录 token
     * 在下方传参时需要，请备用
     */
    private String captchaKey;
}
