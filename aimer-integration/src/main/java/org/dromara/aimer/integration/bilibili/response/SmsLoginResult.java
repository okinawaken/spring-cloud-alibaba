package org.dromara.aimer.integration.bilibili.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SmsLoginResult {

    /**
     * 是否为新注册用户
     */
    private Boolean isNew;

    /**
     * 未知，可能0就是成功吧
     */
    private Long status;

    /**
     * 跳转 url
     * 默认为 <a href="https://www.bilibili.com">...</a>
     */
    private String url;
}
