package org.dromara.aimer.integration;

import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitScan;
import org.dromara.aimer.api.AimerApiContext;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author bixiu
 */
@Component
@ComponentScan
@EnableDiscoveryClient
@EnableFeignClients(basePackageClasses = AimerApiContext.class)
@RetrofitScan(basePackageClasses = AimerIntegrationContext.class)
public class AimerIntegrationContext {
}
