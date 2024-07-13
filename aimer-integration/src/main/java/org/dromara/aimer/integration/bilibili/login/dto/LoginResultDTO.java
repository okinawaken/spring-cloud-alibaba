package org.dromara.aimer.integration.bilibili.login.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class LoginResultDTO {

    private String url;

    private String refreshToken;

    private Long timestamp;

    private Integer code;

    private String message;
}
