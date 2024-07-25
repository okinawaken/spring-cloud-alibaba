package org.dromara.aimer.service.service.bilibili.sdk.interceptor;

import com.github.lianjiatech.retrofit.spring.boot.interceptor.BasePathMatchInterceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.dromara.aimer.service.internal.generator.IAccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class AddCookiesInterceptor extends BasePathMatchInterceptor {

    @Autowired
    private IAccountInfoService accountInfoService;

    @Override
    protected Response doIntercept(Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();
        // todo 添加cookie

        return chain.proceed(builder.build());
    }
}
