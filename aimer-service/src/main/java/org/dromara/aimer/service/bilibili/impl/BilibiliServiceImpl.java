package org.dromara.aimer.service.bilibili.impl;

import lombok.extern.slf4j.Slf4j;
import org.dromara.aimer.common.response.BaseResponse;
import org.dromara.aimer.integration.bilibili.login.LoginService;
import org.dromara.aimer.integration.bilibili.login.dto.LoginResultDTO;
import org.dromara.aimer.integration.bilibili.login.dto.QRCodeDTO;
import org.dromara.aimer.integration.bilibili.ticket.TicketService;
import org.dromara.aimer.service.bilibili.BilibiliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BilibiliServiceImpl implements BilibiliService {

    @Autowired
    private LoginService loginService;

    @Autowired
    private TicketService ticketService;

    @Override
    public QRCodeDTO generateQRCode() {
        BaseResponse<QRCodeDTO> response = loginService.generateQRCode();
        return response.getData();
    }

    @Override
    public LoginResultDTO checkQRStatus(QRCodeDTO qrCodeDTO) {
        String qrcodeKey = qrCodeDTO.getQrcodeKey();
        BaseResponse<LoginResultDTO> response = loginService.pollQRCode(qrcodeKey);
        return response.getData();
    }
}
