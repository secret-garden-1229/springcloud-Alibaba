package com.benghuai.springcloud.myconfig;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.benghuai.springcloud.dao"})
public class MyBatisConfig {
}
