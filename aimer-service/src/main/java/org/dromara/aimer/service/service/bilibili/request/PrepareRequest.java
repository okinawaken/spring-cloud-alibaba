package org.dromara.aimer.service.service.bilibili.request;

import lombok.Data;

import java.util.List;

@Data
public class PrepareRequest {
    /**
     * 购买数量
     */
    private Long count;
    /**
     * 订单类型
     */
    private Long orderType;
    /**
     * 项目id
     */
    private Long projectID;
    /**
     * 拼团ID
     */
    private Long promoGroupID;
    /**
     * 活动ID
     */
    private Long promoID;
    /**
     * 场次id
     */
    private Long screenID;
    /**
     * 座位信息
     */
    private List<String> seats;
    /**
     * sku id
     */
    private Long skuID;
    /**
     * TOKEN
     */
    private String token;
    /**
     * 凭证,二次验证通过后得到的
     */
    private String voucher;
}
