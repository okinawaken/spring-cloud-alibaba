package org.dromara.aimer.service.service.bilibili.interceptor;

import com.github.lianjiatech.retrofit.spring.boot.interceptor.BasePathMatchInterceptor;
import okhttp3.Response;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class ReceivedCookiesInterceptor extends BasePathMatchInterceptor {
    @Override
    protected Response doIntercept(Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());
        List<String> setCookieHeaders = originalResponse.headers("Set-Cookie");
        if (CollectionUtils.isNotEmpty(setCookieHeaders)) {
            // todo 保存cookie
        }
        return originalResponse;
    }
}
