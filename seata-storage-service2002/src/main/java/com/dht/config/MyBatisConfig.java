package com.dht.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.dht.dao"})
public class MyBatisConfig {
}
