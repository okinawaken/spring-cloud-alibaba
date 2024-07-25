package org.dromara.aimer.service.service.bilibili.sdk.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import org.dromara.aimer.service.service.bilibili.sdk.dto.PayParamResponseDTO;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CreateStatusResult {

    /**
     * 订单id
     */
    private long orderID;
    private PayParamResponseDTO payParam;
}
