package org.dromara.aimer.integration.bilibili.login;

import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitClient;
import org.dromara.aimer.common.response.BaseResponse;
import org.dromara.aimer.integration.bilibili.login.dto.LoginResultDTO;
import org.dromara.aimer.integration.bilibili.login.dto.QRCodeDTO;
import org.dromara.aimer.integration.constants.ApiUrlConstant;
import retrofit2.http.GET;
import retrofit2.http.Query;

@RetrofitClient(baseUrl = ApiUrlConstant.PASSPORT_URL + "/x/passport-login/web/")
public interface LoginService {

    @GET("qrcode/generate")
    BaseResponse<QRCodeDTO> generateQRCode();

    @GET("qrcode/poll")
    BaseResponse<LoginResultDTO> pollQRCode(@Query(value = "qrcode_key") String qrcodeKey);
}
