package org.dromara.aimer.integration.bilibili.login;

import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitClient;
import com.github.lianjiatech.retrofit.spring.boot.interceptor.Intercept;
import com.github.lianjiatech.retrofit.spring.boot.interceptor.Intercepts;
import org.dromara.aimer.common.response.BaseResponse;
import org.dromara.aimer.integration.bilibili.interceptor.AddCookiesInterceptor;
import org.dromara.aimer.integration.bilibili.interceptor.ReceivedCookiesInterceptor;
import org.dromara.aimer.integration.bilibili.login.response.ListCountryResult;
import org.dromara.aimer.integration.constants.ApiUrlConstant;
import retrofit2.http.GET;

/**
 * web端通用服务
 */
@Intercepts(value = {
        @Intercept(handler = AddCookiesInterceptor.class),
        @Intercept(handler = ReceivedCookiesInterceptor.class)
})
@RetrofitClient(baseUrl = ApiUrlConstant.PASSPORT_URL)
public interface WebGenericService {

    /**
     * 获取国际冠字码_web端
     */
    @GET("web/generic/country/list")
    BaseResponse<ListCountryResult> listCountry();
}
