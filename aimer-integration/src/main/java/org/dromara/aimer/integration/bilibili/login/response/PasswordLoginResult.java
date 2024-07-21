package org.dromara.aimer.integration.bilibili.login.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PasswordLoginResult {

    /**
     * 扫码状态信息
     */
    private String message;

    /**
     * 刷新refresh_token
     */
    private String refreshToken;

    /**
     * 状态
     */
    private Long status;

    /**
     * 登录时间
     * 未登录为0
     * 时间戳 单位为毫秒
     */
    private Long timestamp;

    /**
     * 游戏分站跨域登录 url
     */
    private String url;
}
