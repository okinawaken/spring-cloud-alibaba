package org.dromara.aimer.console.controller;

import org.dromara.aimer.common.response.BaseResponse;
import org.dromara.aimer.service.utils.MybatisPlusGeneratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/mybatis")
public class MybatisController {

    @Autowired
    private MybatisPlusGeneratorUtils mybatisPlusGeneratorUtils;

    @GetMapping("/generator")
    public BaseResponse<Void> generator() {
        mybatisPlusGeneratorUtils.generateTable();
        return BaseResponse.ok();
    }
}
