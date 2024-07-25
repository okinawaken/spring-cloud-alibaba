package org.dromara.aimer.service.service.bilibili.sdk.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import org.dromara.aimer.service.service.bilibili.sdk.dto.CountryDTO;

import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ListCountryResult {

    /**
     * 常用国家&地区
     */
    private List<CountryDTO> common;

    /**
     * 其他国家&地区
     */
    private List<CountryDTO> others;
}
