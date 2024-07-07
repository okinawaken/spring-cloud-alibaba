package org.dromara.aimer.repository;

import org.dromara.aimer.repository.mapper.AimerRepositoryMapperPackage;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author bixiu
 */
@Component
@ComponentScan
@MapperScan(basePackageClasses = AimerRepositoryMapperPackage.class)
public class AimerRepositoryContext {
}
