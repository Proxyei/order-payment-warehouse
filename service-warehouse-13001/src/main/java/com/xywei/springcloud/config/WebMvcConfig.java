package com.xywei.springcloud.config;

import com.xywei.springcloud.config.interceptor.AccessFromGatewayInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author future
 * @DateTime 2021/3/11 13:13
 * @Description
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private AccessFromGatewayInterceptor accessFromGatewayInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(accessFromGatewayInterceptor);
    }
}
