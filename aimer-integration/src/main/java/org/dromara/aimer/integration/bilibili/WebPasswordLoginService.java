package org.dromara.aimer.integration.bilibili;


import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitClient;
import com.github.lianjiatech.retrofit.spring.boot.interceptor.Intercept;
import com.github.lianjiatech.retrofit.spring.boot.interceptor.Intercepts;
import org.dromara.aimer.common.response.BaseResponse;
import org.dromara.aimer.integration.bilibili.interceptor.AddCookiesInterceptor;
import org.dromara.aimer.integration.bilibili.interceptor.ReceivedCookiesInterceptor;
import org.dromara.aimer.integration.bilibili.request.PasswordLoginRequest;
import org.dromara.aimer.integration.bilibili.response.PasswordLoginResult;
import org.dromara.aimer.integration.bilibili.response.WebKeyResult;
import org.dromara.aimer.integration.bilibili.constants.ApiUrlConstant;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * web端账号密码登录
 */
@Intercepts(value = {
        @Intercept(handler = AddCookiesInterceptor.class),
        @Intercept(handler = ReceivedCookiesInterceptor.class)
})
@RetrofitClient(baseUrl = ApiUrlConstant.PASSPORT_URL)
public interface WebPasswordLoginService {

    /**
     * 获取公钥&盐(web端)
     */
    @GET("x/passport-login/web/key")
    BaseResponse<WebKeyResult> getWebKey();

    /**
     * 登录操作(web端)
     */
    @FormUrlEncoded
    @POST("x/passport-login/web/login")
    BaseResponse<PasswordLoginResult> passwordLogin(PasswordLoginRequest request);
}
