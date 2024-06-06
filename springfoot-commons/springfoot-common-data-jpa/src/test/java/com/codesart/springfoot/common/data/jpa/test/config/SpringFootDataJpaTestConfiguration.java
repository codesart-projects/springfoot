package com.codesart.springfoot.common.data.jpa.test.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.codesart.springfoot.common.data.test")
@EntityScan(basePackages = {"com.codesart.springfoot.common.data.test.entity"})
@EnableJpaRepositories(basePackages = {"com.codesart.springfoot.common.data.test.repository"})
public class SpringFootDataJpaTestConfiguration {

}