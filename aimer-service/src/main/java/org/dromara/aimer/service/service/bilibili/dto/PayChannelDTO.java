package org.dromara.aimer.service.service.bilibili.dto;

import java.util.List;

public class PayChannelDTO {
    /**
     * 跳转地址描述
     */
    private String channelRedirectDesc;
    /**
     * 支付方式跳转地址
     */
    private String channelRedirectURL;
    /**
     * 设备类型
     */
    private List<Long> deviceTypes;
    /**
     * 顺序
     */
    private Long order;
    /**
     * pay channel
     */
    private String payChannel;
    /**
     * id
     */
    private Long payChannelID;
    /**
     * 支付方式logo图片地址
     */
    private String payChannelLogo;
    /**
     * 支付方式描述
     */
    private String payChannelName;
    /**
     * 支付方式展示描述
     */
    private String payChannelShow;
    /**
     * 支付方式描述名称2
     */
    private String payChannelShowName;
    /**
     * real
     */
    private String realChannel;
}
