package org.dromara.aimer.integration.bilibili.login.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PasswordLoginRequest {

    /**
     * 用户登录账号
     * 手机号或邮箱地址
     */
    private String username;

    /**
     * 加密后的带盐密码
     * base64 格式
     */
    private String password;

    /**
     * 是否记住登录
     */
    private Long keep;

    /**
     * 登录 token
     * 在申请 captcha 验证码接口处获取
     */
    private String token;

    /**
     * 极验 challenge
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

    /**
     * 跳转url
     * 默认为 <a href="https://www.bilibili.com">...</a>
     */
    private String goUrl;

    /**
     * 登录来源
     * main_web：独立登录页
     * main_mini：小窗登录
     */
    private String source;
}
