package org.akanami.springboot.interceptordemo.configuration;

import org.akanami.springboot.interceptordemo.interceptors.ConsoleInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport{

    @Autowired
    ConsoleInterceptor consoleInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(consoleInterceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/login", "/account/register");
        registry.addInterceptor(consoleInterceptor)
                .addPathPatterns("/console*")
                .excludePathPatterns("/console/no");


        super.addInterceptors(registry);
    }
}
