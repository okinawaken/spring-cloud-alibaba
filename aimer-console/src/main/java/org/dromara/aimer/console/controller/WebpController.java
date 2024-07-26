package org.dromara.aimer.console.controller;

import org.dromara.aimer.common.response.BaseResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/webp")
public class WebpController {

    @PostMapping("/encode")
    public BaseResponse<Void> encode(MultipartFile multipartFile) {
        return BaseResponse.ok();
    }
}
