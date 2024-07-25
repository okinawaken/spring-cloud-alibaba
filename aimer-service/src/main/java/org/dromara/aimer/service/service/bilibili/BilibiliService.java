package org.dromara.aimer.service.service.bilibili;

import org.dromara.aimer.service.service.bilibili.dto.LoginInfoDTO;
import org.dromara.aimer.service.service.bilibili.dto.LoginResultDTO;

public interface BilibiliService {

    LoginResultDTO login(LoginInfoDTO loginInfoDTO);
}
