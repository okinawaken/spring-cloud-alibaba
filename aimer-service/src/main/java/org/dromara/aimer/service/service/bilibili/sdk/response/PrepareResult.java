package org.dromara.aimer.service.service.bilibili.sdk.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PrepareResult {
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
