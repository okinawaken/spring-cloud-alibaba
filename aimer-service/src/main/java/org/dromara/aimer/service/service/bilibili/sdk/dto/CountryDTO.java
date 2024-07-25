package org.dromara.aimer.service.service.bilibili.sdk.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CountryDTO {

    /**
     * 国际代码值
     */
    private Integer id;

    /**
     * 国家&地区名
     */
    private String cname;

    /**
     * 国家&地区区号
     */
    private String countryId;
}