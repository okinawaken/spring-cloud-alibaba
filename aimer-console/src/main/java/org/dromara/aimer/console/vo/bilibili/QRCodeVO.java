package org.dromara.aimer.console.vo.bilibili;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.github.linpeilie.annotations.AutoMapper;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.dromara.aimer.integration.bilibili.login.dto.QRCodeDTO;

@Data
@AutoMapper(target = QRCodeDTO.class)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class QRCodeVO {

    @NotNull(message = "url不能为空")
    private String url;

    @NotNull(message = "qrcodeKey不能为空")
    private String qrcodeKey;
}
