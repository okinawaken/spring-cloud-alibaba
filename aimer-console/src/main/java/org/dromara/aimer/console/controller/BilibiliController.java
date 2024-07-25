package org.dromara.aimer.console.controller;

import org.dromara.aimer.common.response.BaseResponse;
import org.dromara.aimer.service.service.bilibili.BilibiliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bilibili")
public class BilibiliController {

    @Autowired
    private BilibiliService bilibiliService;

    @GetMapping(value = "test")
    public BaseResponse<Void> test() {
        return BaseResponse.ok();
    }
}
