package org.dromara.aimer.service.service.bilibili.sdk.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import org.dromara.aimer.service.service.bilibili.sdk.dto.ConfirmCouponDTO;
import org.dromara.aimer.service.service.bilibili.sdk.dto.ConfirmSeatDTO;
import org.dromara.aimer.service.service.bilibili.sdk.dto.ConfirmYearCardDTO;
import org.dromara.aimer.service.service.bilibili.sdk.dto.PayChannelResponseDTO;

import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ConfirmInfoResult {
    /**
     * 购票人信息  1-手机号 2-身份证 3-身份证照片,可以配多项，以逗号分隔，如1,2表示需要手机和身份证
     */
    private String buyerInfo;
    /**
     * 购买数量
     */
    private Long count;
    /**
     * 可用优惠券列表
     */
    private List<ConfirmCouponDTO> couponList;
    /**
     * 创建订单版本，此版本会标志不同创建订单的方式，转化率会怎样
     */
    private String createVersion;
    /**
     * 配送方式：配送方式: 1-不配送, 2-自取, 3-快递
     */
    private Long deliverType;
    /**
     * 运费,单位:分
     */
    private Long expressFee;
    /**
     * 运费类型 1-正常  2-免邮 3-到付 4-大会员包邮
     */
    private Long expressType;
    /**
     * 总金额
     */
    private Long itemTotalMoney;
    private PayChannelResponseDTO payChannelList;
    /**
     * 实付金额，单位：分
     */
    private Long payMoney;
    /**
     * 项目id
     */
    private Long projectID;
    /**
     * 项目头图
     */
    private String projectImg;
    /**
     * 项目名
     */
    private String projectName;
    /**
     * 场次id
     */
    private Long screenID;
    /**
     * 场次名
     */
    private String screenName;
    /**
     * 座位信息
     */
    private List<ConfirmSeatDTO> seats;
    /**
     * 是否展示收银台信息
     */
    private Boolean showCashier;
    /**
     * 出票方式: 1-纸质票, 2-电子票, 3-外部票
     */
    private Long ticketType;
    /**
     * 场馆名称
     */
    private String venueName;
    private ConfirmYearCardDTO yearCard;
}
