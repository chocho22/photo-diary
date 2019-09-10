package com.pt.diary.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.pt.diary.mapper")
public class DBConfig {

}
