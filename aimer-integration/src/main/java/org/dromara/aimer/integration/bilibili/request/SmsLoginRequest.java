package org.dromara.aimer.integration.bilibili.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SmsLoginRequest {

    /**
     * 国际冠字码
     * 可以从获取国际冠字码获取
     */
    private Long cid;

    /**
     * 手机号码
     */
    private Long tel;

    /**
     * 短信验证码
     */
    private Long code;

    /**
     * 登录来源
     * main_web：独立登录页
     * main_mini：小窗登录
     */
    private String source;

    /**
     * 短信登录 token
     */
    private String captchaKey;

    /**
     * 跳转url
     * 默认为 <a href="https://www.bilibili.com">...</a>
     */
    private String goUrl;

    /**
     * 是否记住登录
     */
    private Boolean keep;
}
