package org.dromara.aimer.service.service.bilibili.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class GeetestDTO {

    /**
     * 极验id
     */
    private String gt;

    /**
     * 极验KEY
     */
    private String challenge;
}
