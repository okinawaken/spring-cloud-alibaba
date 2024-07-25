package org.dromara.aimer.service.internal.generator.impl;

import org.dromara.aimer.repository.domain.AccountInfoDO;
import org.dromara.aimer.repository.mapper.AccountInfoMapper;
import org.dromara.aimer.service.internal.generator.IAccountInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账户信息表 服务实现类
 * </p>
 *
 * @author bixiu
 * @since 2024-07-25
 */
@Service
public class AccountInfoServiceImpl extends ServiceImpl<AccountInfoMapper, AccountInfoDO> implements IAccountInfoService {

}
