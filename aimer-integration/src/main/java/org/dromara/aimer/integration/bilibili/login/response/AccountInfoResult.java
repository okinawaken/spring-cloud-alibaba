package org.dromara.aimer.integration.bilibili.login.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AccountInfoResult {

    /**
     * 我的mid
     */
    private Long mid;

    /**
     * 我的昵称
     */
    private String uname;

    /**
     * 我的用户名
     */
    private String userid;

    /**
     * 我的签名
     */
    private String sign;

    /**
     * 我的生日
     */
    private String birthday;

    /**
     * 我的性别
     */
    private String sex;

    /**
     * 是否未设置昵称
     */
    private Boolean nickFree;

    /**
     * 我的会员等级
     */
    private String rank;
}
