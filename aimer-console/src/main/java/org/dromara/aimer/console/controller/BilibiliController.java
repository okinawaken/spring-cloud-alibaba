package org.dromara.aimer.console.controller;

import org.dromara.aimer.common.response.BaseResponse;
import org.dromara.aimer.common.utils.MapstructUtils;
import org.dromara.aimer.console.vo.bilibili.LoginResultVO;
import org.dromara.aimer.console.vo.bilibili.QRCodeVO;
import org.dromara.aimer.integration.bilibili.login.dto.LoginResultDTO;
import org.dromara.aimer.integration.bilibili.login.dto.QRCodeDTO;
import org.dromara.aimer.service.bilibili.impl.BilibiliServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bilibili")
public class BilibiliController {

    @Autowired
    private BilibiliServiceImpl bilibiliService;

    @GetMapping("/generate_qr_code")
    public BaseResponse<QRCodeVO> generateQRCode() {
        QRCodeDTO dto = bilibiliService.generateQRCode();
        QRCodeVO vo = MapstructUtils.convert(dto, QRCodeVO.class);
        return BaseResponse.ok(vo);
    }

    @GetMapping("/check_qr_status")
    public BaseResponse<LoginResultVO> checkQRStatus(@Validated QRCodeVO qrCodeVO) {
        QRCodeDTO qrCodeDTO = MapstructUtils.convert(qrCodeVO, QRCodeDTO.class);
        LoginResultDTO loginResultDTO = bilibiliService.checkQRStatus(qrCodeDTO);
        LoginResultVO loginResultVO = MapstructUtils.convert(loginResultDTO, LoginResultVO.class);
        return BaseResponse.ok(loginResultVO);
    }
}
