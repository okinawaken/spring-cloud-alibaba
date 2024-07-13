package org.dromara.aimer.integration.bilibili.ticket.model;

public class ConfirmYearCard {
    /**
     * 能否使用年卡 1-能 0-不能
     */
    private Long canUse;
    /**
     * 优惠金额,单位：分
     */
    private Long discount;
    /**
     * 使用年卡后的支付金额，单位：分
     */
    private Long payMoney;
}
