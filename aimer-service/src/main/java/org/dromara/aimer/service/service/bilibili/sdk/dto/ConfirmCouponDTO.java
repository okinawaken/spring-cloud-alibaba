package org.dromara.aimer.service.service.bilibili.sdk.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ConfirmCouponDTO {
    /**
     * 优惠券code
     */
    private String code;
    /**
     * 优惠
     */
    private Long discount;
    /**
     * 优惠券失效时间
     */
    private String endDate;
    /**
     * 优惠券名称
     */
    private String name;
    /**
     * 支付金额
     */
    private Long payMoney;
    /**
     * 适用范围：0-全部商品可用 3-部分商品可用 4-部分类目可用
     */
    private Long scope;
    /**
     * 优惠券生效时间
     */
    private String startDate;
    /**
     * 优惠券样式：1-金额 2-折扣
     */
    private Long style;
    /**
     * 优惠券类型：1-抱团购 2-满减 3-立减
     */
    private Long type;
}
