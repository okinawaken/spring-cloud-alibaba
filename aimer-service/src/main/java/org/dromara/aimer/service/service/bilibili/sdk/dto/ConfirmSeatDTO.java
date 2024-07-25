package org.dromara.aimer.service.service.bilibili.sdk.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ConfirmSeatDTO {

    /**
     * 区域名
     */
    private String areaName;
    /**
     * 座位信息
     */
    private String areaSeat;
    /**
     * 座位详情
     */
    private String desc;
    /**
     * 票价
     */
    private Long price;
    /**
     * 票种id
     */
    private Long skuID;
}
