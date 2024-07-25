package org.dromara.aimer.service.service.bilibili.sdk.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class QrCodePollResult {

    /**
     * 游戏分站跨域登录 url
     */
    private String url;

    /**
     * 刷新refresh_token
     */
    private String refreshToken;

    /**
     * 登录时间
     */
    private Long timestamp;

    /**
     * 0：扫码登录成功
     * 86038：二维码已失效
     * 86090：二维码已扫码未确认
     * 86101：未扫码
     */
    private Integer code;

    /**
     * 扫码状态信息
     */
    private String message;
}
