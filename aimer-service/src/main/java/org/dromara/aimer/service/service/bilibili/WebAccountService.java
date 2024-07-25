package org.dromara.aimer.service.service.bilibili;

import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitClient;
import com.github.lianjiatech.retrofit.spring.boot.interceptor.Intercept;
import com.github.lianjiatech.retrofit.spring.boot.interceptor.Intercepts;
import org.dromara.aimer.common.response.BaseResponse;
import org.dromara.aimer.service.service.bilibili.interceptor.AddCookiesInterceptor;
import org.dromara.aimer.service.service.bilibili.interceptor.ReceivedCookiesInterceptor;
import org.dromara.aimer.service.service.bilibili.response.AccountInfoResult;
import org.dromara.aimer.service.service.bilibili.constants.ApiUrlConstant;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * web账号服务
 */
@Intercepts(value = {
        @Intercept(handler = AddCookiesInterceptor.class),
        @Intercept(handler = ReceivedCookiesInterceptor.class)
})
@RetrofitClient(baseUrl = ApiUrlConstant.API_URL)
public interface WebAccountService {

    /**
     * 获取我的信息
     */
    @GET("x/member/web/account")
    BaseResponse<AccountInfoResult> getAccountInfo(@Query(value = "access_key") String accessKey);
}
