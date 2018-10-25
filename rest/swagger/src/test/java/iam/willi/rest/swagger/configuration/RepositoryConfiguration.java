package iam.willi.rest.swagger.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"am.willi.rest.swagger.domain"})
@EnableJpaRepositories(basePackages = {"am.willi.rest.swagger.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
