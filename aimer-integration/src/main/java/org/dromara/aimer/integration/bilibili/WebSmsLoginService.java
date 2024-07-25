package org.dromara.aimer.integration.bilibili;

import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitClient;
import com.github.lianjiatech.retrofit.spring.boot.interceptor.Intercept;
import com.github.lianjiatech.retrofit.spring.boot.interceptor.Intercepts;
import org.dromara.aimer.common.response.BaseResponse;
import org.dromara.aimer.integration.bilibili.interceptor.AddCookiesInterceptor;
import org.dromara.aimer.integration.bilibili.interceptor.ReceivedCookiesInterceptor;
import org.dromara.aimer.integration.bilibili.request.SendSmsRequest;
import org.dromara.aimer.integration.bilibili.request.SmsLoginRequest;
import org.dromara.aimer.integration.bilibili.response.SendSmsResult;
import org.dromara.aimer.integration.bilibili.response.SmsLoginResult;
import org.dromara.aimer.integration.bilibili.constants.ApiUrlConstant;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * web端短信登录
 */
@Intercepts(value = {
        @Intercept(handler = AddCookiesInterceptor.class),
        @Intercept(handler = ReceivedCookiesInterceptor.class)
})
@RetrofitClient(baseUrl = ApiUrlConstant.PASSPORT_URL)
public interface WebSmsLoginService {

    /**
     * 发送短信验证码_web端
     */
    @FormUrlEncoded
    @POST("x/passport-login/web/sms/send")
    BaseResponse<SendSmsResult> sendSms(SendSmsRequest request);

    /**
     * 使用短信验证码登录_web端
     */
    @FormUrlEncoded
    @POST("x/passport-login/web/login/sms")
    BaseResponse<SmsLoginResult> smsLogin(SmsLoginRequest request);
}
