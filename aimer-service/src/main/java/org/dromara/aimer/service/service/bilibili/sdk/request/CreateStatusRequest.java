package org.dromara.aimer.service.service.bilibili.sdk.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CreateStatusRequest {
    /**
     * token是之前order/createV2接口生成的
     */
    private String token;
}
