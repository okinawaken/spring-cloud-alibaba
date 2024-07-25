package org.dromara.aimer.api.service;

import org.dromara.aimer.api.constants.ApplicationConstant;
import org.dromara.aimer.common.response.BaseResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = ApplicationConstant.AIMER_CONSOLE)
public interface EchoService {
    @GetMapping(value = "/echo/{str}")
    BaseResponse<String> echo(@PathVariable("str") String str);
}