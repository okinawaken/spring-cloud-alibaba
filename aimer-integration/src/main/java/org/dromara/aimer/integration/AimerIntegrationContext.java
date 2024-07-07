package org.dromara.aimer.integration;

import org.dromara.aimer.api.AimerApiPackage;
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
@EnableFeignClients(basePackageClasses = AimerApiPackage.class)
public class AimerIntegrationContext {
}
