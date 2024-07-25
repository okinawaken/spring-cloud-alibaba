package org.dromara.aimer.repository.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import org.dromara.aimer.repository.base.BaseDO;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 账户信息表
 * </p>
 *
 * @author bixiu
 * @since 2024-07-25
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("account_info")
public class AccountInfoDO extends BaseDO {

    private static final long serialVersionUID = 1L;

    /**
     * 第三方平台用户ID
     */
    @TableField("biz_id")
    private String bizId;

    /**
     * 用户名
     */
    @TableField("username")
    private String username;

    /**
     * 用户密码
     */
    @TableField("password")
    private String password;

    /**
     * 用户邮件地址
     */
    @TableField("email")
    private String email;

    /**
     * 用户cookie信息
     */
    @TableField("cookie")
    private String cookie;

    /**
     * 用户性别：0、未知 1、男 2、女
     */
    @TableField("sex")
    private Integer sex;

    /**
     * 登录方式：0、账号密码登录 1、邮件登录 2、cookie登录
     */
    @TableField("login_type")
    private Integer loginType;

    /**
     * 第三方平台类型：0、哔哩哔哩
     */
    @TableField("platform")
    private Integer platform;
}
