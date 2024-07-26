package org.dromara.aimer.console.controller;

import org.dromara.aimer.common.response.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webp")
public class WebpController {

    @GetMapping("/encode")
    public BaseResponse<Void> encode() {
        return BaseResponse.ok();
    }
}
