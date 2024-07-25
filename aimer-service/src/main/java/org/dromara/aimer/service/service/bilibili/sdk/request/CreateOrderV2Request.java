package org.dromara.aimer.service.service.bilibili.sdk.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CreateOrderV2Request {
    /**
     * 是否是重复订单
     */
    private Long again;
    /**
     * 购买人信息
     */
    private String buyerInfo;
    /**
     * 购买数量
     */
    private Long count;
    /**
     * 优惠券code
     */
    private Long couponCode;
    /**
     * 收货信息
     */
    private String deliverInfo;
    /**
     * 订单类型
     */
    private Long orderType;
    /**
     * 实付金额 单位:分
     */
    private Long payMoney;
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
     * 时间戳
     */
    private Long timestamp;
    /**
     * TOKEN
     */
    private String token;
    /**
     * 是否使用年卡
     */
    private Long useYearCard;
    /**
     * 创建订单版本号
     */
    private String version;
    /**
     * 凭证,二次验证通过后得到的
     */
    private String voucher;
}
