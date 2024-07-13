package org.dromara.aimer.service.bilibili;

import org.dromara.aimer.integration.bilibili.login.dto.LoginResultDTO;
import org.dromara.aimer.integration.bilibili.login.dto.QRCodeDTO;

public interface BilibiliService {

    QRCodeDTO generateQRCode();

    LoginResultDTO checkQRStatus(QRCodeDTO qrCodeDTO);
}
