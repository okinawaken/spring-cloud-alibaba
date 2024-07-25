package org.dromara.aimer.integration.bilibili;

import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitClient;
import com.github.lianjiatech.retrofit.spring.boot.interceptor.Intercept;
import com.github.lianjiatech.retrofit.spring.boot.interceptor.Intercepts;
import org.dromara.aimer.common.response.BaseResponse;
import org.dromara.aimer.integration.bilibili.interceptor.AddCookiesInterceptor;
import org.dromara.aimer.integration.bilibili.interceptor.ReceivedCookiesInterceptor;
import org.dromara.aimer.integration.bilibili.response.CaptchaResult;
import org.dromara.aimer.integration.bilibili.constants.ApiUrlConstant;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * web验证码服务
 */
@Intercepts(value = {
        @Intercept(handler = AddCookiesInterceptor.class),
        @Intercept(handler = ReceivedCookiesInterceptor.class)
})
@RetrofitClient(baseUrl = ApiUrlConstant.PASSPORT_URL)
public interface WebCaptchaService {

    /**
     * 申请captcha验证码
     */
    @GET("x/passport-login/captcha")
    BaseResponse<CaptchaResult> requestCaptcha(@Query(value = "source") String source);
}
