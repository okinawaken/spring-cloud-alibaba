package org.dromara.aimer.service.service.bilibili.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SendSmsRequest {

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
     * 登录来源
     * main_web：独立登录页
     * main_mini：小窗登录
     */
    private String source;

    /**
     * 登录 API token
     * 在申请 captcha 验证码接口处获取
     */
    private String token;

    /**
     * 极验 challenge
     * 在申请 captcha 验证码接口处获取
     */
    private String challenge;

    /**
     * 极验 result
     * 极验验证后得到
     */
    private String validate;

    /**
     * 极验 result +|jordan
     * 极验验证后得到
     */
    private String seccode;
}
