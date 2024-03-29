package com.crazycode.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class C3P0Config {
    @Bean
    @ConfigurationProperties(prefix = "jdbc.datasource")
    public DataSource C3P0dataSource(){
        return new ComboPooledDataSource();
    }
}
