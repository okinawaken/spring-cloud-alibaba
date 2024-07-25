package org.dromara.aimer.api.service;

import org.dromara.aimer.api.constants.ApplicationConstant;
import org.dromara.aimer.common.response.BaseResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = ApplicationConstant.AIMER_CONSOLE)
public interface EchoService {
    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    BaseResponse<String> echo(@PathVariable("str") String str);
}