package com.codesart.springfoot.common.redis.config;

import org.redisson.spring.starter.RedissonAutoConfigurationV2;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;

@AutoConfigureBefore(RedissonAutoConfigurationV2.class)
public class SpringFootCommonRedisAutoConfig {
    
}
