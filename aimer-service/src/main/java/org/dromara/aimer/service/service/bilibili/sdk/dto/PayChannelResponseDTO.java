package org.dromara.aimer.service.service.bilibili.sdk.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PayChannelResponseDTO {
    /**
     * 是否允许展示内容
     */
    private Boolean canShowContent;
    /**
     * 支付方式列表
     */
    private List<PayChannelDTO> channels;
    /**
     * 客户id
     */
    private Long customerID;
    /**
     * 默认支付方式
     */
    private String defaultPayChannel;
    /**
     * 货币单位
     */
    private String feeTypeSymbol;
    /**
     * 支付金额描述
     */
    private String payAmountDesc;
    /**
     * 支付剩余时间
     */
    private Long payLeftTime;
    /**
     * 服务器时间
     */
    private Long serverTime;
    /**
     * 标志id
     */
    private Long traceID;
}
