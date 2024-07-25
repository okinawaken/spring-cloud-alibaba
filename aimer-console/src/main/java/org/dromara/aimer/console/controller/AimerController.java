package org.dromara.aimer.console.controller;

import org.dromara.aimer.common.response.BaseResponse;
import org.dromara.aimer.integration.aimer.EchoRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aimer")
public class AimerController {

    @Autowired
    private EchoRpcService echoRpcService;

    @GetMapping(value = "/echo/{str}")
    public BaseResponse<String> echo(@PathVariable String str) {
        String result = echoRpcService.echo(str);
        return BaseResponse.ok(result);
    }
}
