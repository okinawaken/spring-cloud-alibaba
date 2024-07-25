package org.dromara.aimer.integration.bilibili.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import org.dromara.aimer.integration.bilibili.dto.GeetestDTO;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CaptchaResult {

    /**
     * 验证方式
     * 用于判断使用哪一种验证方式，目前所见只有极验
     * geetest：极验
     */
    private String type;

    /**
     * 登录 API token
     * 与 captcha 无关，与登录接口有关
     */
    private String token;

    /**
     * 极验captcha数据
     */
    private GeetestDTO geetest;
}
