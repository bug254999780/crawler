package com.free.clawler.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.free.clawler.main")
public class MvcConfig {
    // , includeFilters = { @ComponentScan.Filter(type = FilterType.ANNOTATION, value = { Controller.class }) }
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver irv = new InternalResourceViewResolver();
        irv.setPrefix("/WEB-INF/classes/views/");
        irv.setSuffix(".jsp");
        // irv.setViewClass(JstlView.class);
        return irv;
    }

    // // 自定义拦截器
    @Bean
    public HandlerInterceptor Interceptor() {
        return new HandlerInterceptor();
    }
}
