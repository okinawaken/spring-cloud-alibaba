package org.dromara.aimer.integration.bilibili.ticket.request;

import lombok.Data;

@Data
public class ConfirmInfoRequest {
    /**
     * 是否获取收银台支付列表
     */
    private String showCashier;
    /**
     * token是之前order/prepare接口对下单参数进行加密后得到的
     */
    private String token;
}
