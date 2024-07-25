package org.dromara.aimer.service;

import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitScan;
import org.dromara.aimer.integration.AimerIntegrationContext;
import org.dromara.aimer.repository.AimerRepositoryContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @author bixiu
 */
@Component
@ComponentScan
@RetrofitScan
@Import({AimerRepositoryContext.class, AimerIntegrationContext.class})
public class AimerServiceContext {
}
