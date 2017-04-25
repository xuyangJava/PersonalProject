package com.sipingsoft.office.conf;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tk.mybatis.spring.mapper.MapperScannerConfigurer;

// 配置mybatis插件
@Configuration
public class MybatisConfig {

    @Bean
    public MapperScannerConfigurer MapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.isea533.mybatis.mapper");
        Properties p = new Properties();
        p.setProperty("mappers", "tk.mybatis.mapper.common.Mapper");
        msc.setProperties(p);
        return msc;
    }
}
