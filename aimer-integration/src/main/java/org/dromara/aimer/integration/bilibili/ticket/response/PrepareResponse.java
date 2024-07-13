package org.dromara.aimer.integration.bilibili.ticket.response;

import java.util.List;

public class PrepareResponse {
    /**
     * 锁定失败的座位
     */
    private List<String> failedSeats;
    /**
     * 项目头图
     */
    private String projectImg;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 场次名称
     */
    private String screenName;
    /**
     * 锁定成功的座位
     */
    private List<String> successSeats;
    /**
     * token
     */
    private String token;
}
