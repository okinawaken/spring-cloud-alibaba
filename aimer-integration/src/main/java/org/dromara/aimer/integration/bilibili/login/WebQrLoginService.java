package org.dromara.aimer.integration.bilibili.login;

import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitClient;
import com.github.lianjiatech.retrofit.spring.boot.interceptor.Intercept;
import com.github.lianjiatech.retrofit.spring.boot.interceptor.Intercepts;
import org.dromara.aimer.common.response.BaseResponse;
import org.dromara.aimer.integration.bilibili.interceptor.AddCookiesInterceptor;
import org.dromara.aimer.integration.bilibili.interceptor.ReceivedCookiesInterceptor;
import org.dromara.aimer.integration.bilibili.login.response.GenerateQrCodeResult;
import org.dromara.aimer.integration.bilibili.login.response.QrCodePollResult;
import org.dromara.aimer.integration.constants.ApiUrlConstant;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * web端二维码登录
 */
@Intercepts(value = {
        @Intercept(handler = AddCookiesInterceptor.class),
        @Intercept(handler = ReceivedCookiesInterceptor.class)
})
@RetrofitClient(baseUrl = ApiUrlConstant.PASSPORT_URL)
public interface WebQrLoginService {

    /**
     * 申请二维码(web端)
     */
    @GET("x/passport-login/web/qrcode/generate")
    BaseResponse<GenerateQrCodeResult> generateQRCode();

    /**
     * 扫码登录(web端)
     */
    @GET("x/passport-login/web/qrcode/poll")
    BaseResponse<QrCodePollResult> pollQRCode(@Query(value = "qrcode_key") String qrcodeKey);
}
