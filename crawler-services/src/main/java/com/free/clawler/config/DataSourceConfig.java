package com.free.clawler.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
/**
 * Created by aoc on 2016/8/10.
 */
@Configuration
//加载资源文件
@PropertySource({"classpath:/properties/jdbc.properties"})
public class DataSourceConfig {
    /*
	 * 绑定资源属性
	 */
    @Value("${jdbc.driver}")
    String driverClass;
    @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.username}")
    String userName;
    @Value("${jdbc.password}")
    String passWord;
    @Value("${jdbc.maxActive}")
    String maxActive;
    @Value("${jdbc.maxIdle}")
    String maxIdle;
    @Value("${jdbc.minIdle}")
    String minIdle;
    @Value("${jdbc.maxWait}")
    String maxWait;
    @Value("${jdbc.initialSize}")
    String initialSize;

    @Bean(name = "dataSource")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(passWord);
//        dataSource.setInitialSize(Integer.parseInt(initialSize));
//        dataSource.setMinIdle(Integer.parseInt(minIdle));
//        dataSource.setMaxActive(Integer.parseInt(maxActive));
//        dataSource.setMaxWait(Integer.parseInt(maxWait));
        dataSource.setTimeBetweenEvictionRunsMillis(30000);
        dataSource.setValidationQuery("select  'x' ");
//        dataSource.setTestWhileIdle(true);
//        dataSource.setTestOnBorrow(false);
//        dataSource.setTestOnReturn(false);
        return dataSource;
    }

}
