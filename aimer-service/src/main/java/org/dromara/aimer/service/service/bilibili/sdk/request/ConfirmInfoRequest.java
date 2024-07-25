package org.dromara.aimer.service.service.bilibili.sdk.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
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
