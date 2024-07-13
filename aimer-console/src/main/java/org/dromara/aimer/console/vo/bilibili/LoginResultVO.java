package org.dromara.aimer.console.vo.bilibili;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import org.dromara.aimer.integration.bilibili.login.dto.LoginResultDTO;

@Data
@AutoMapper(target = LoginResultDTO.class)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class LoginResultVO {

    private String url;

    private String refreshToken;

    private Long timestamp;

    private Integer code;

    private String message;
}
