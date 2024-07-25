package org.dromara.aimer.service.service.bilibili.sdk.dto;


import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PayParamResponseDTO {

    /**
     * 聚合支付二维码链接
     */
    private String codeURL;
    private Object createIP;
    /**
     * 业务方代码
     */
    private Long customerID;
    /**
     * 默认支付渠道，走ticket.ini配置
     */
    private String defaultChoose;
    /**
     * 设备类型 1-PC,2-h5,3-app,4-公众号,6-小程序
     */
    private Integer deviceType;
    /**
     * 聚合支付二维码过期时间
     */
    private Long expireTime;
    /**
     * 货币类型
     */
    private String feeType;
    /**
     * @SWG\Property
     */
    private Object notifyURL;
    /**
     * 微信用户的openId，只有小程序支付的时候返回，不参加签名
     */
    private String openID;
    /**
     * 订单创建时间，时间戳
     */
    private Long orderCreateTime;
    /**
     * 订单过期时间，项目后台配置,单位：秒
     */
    private Long orderExpire;
    /**
     * 订单号
     */
    private Long orderID;
    /**
     * 原价，单位：分
     */
    private Long originalAmount;
    /**
     * 支付方式 1-收银台 2-聚合支付
     */
    private Long payType;
    /**
     * 实付金额，单位：分
     */
    private Long payAmount;
    /**
     * 商品ID，票务这边即项目ID
     */
    private Long productID;
    /**
     * 商品详情地址，票务这边即项目详情页地址
     */
    private String productURL;
    /**
     * 支付成功跳转地址，用于收银台支付成功后跳转的页面地址，app不用返回
     */
    private String returnURL;
    private Long serviceType;
    /**
     * 展示内容
     */
    private String showContent;
    /**
     * 展示标题
     */
    private String showTitle;
    /**
     * 签名
     */
    private String sign;
    /**
     * 签名方式
     */
    private String signType;
    /**
     * 当前时间戳
     */
    private Long timestamp;
    /**
     * 唯一标识符
     */
    private Long traceID;
    /**
     * 用户id
     */
    private Long uid;
    /**
     * 是否使用花呗分期 1-是 0-否
     */
    private Long useHuabei;
    /**
     * 版本号
     */
    private String version;
}
