package com.xywei.springcloud.config;

import com.xywei.springcloud.filter.AllowHeaderFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author future
 * @DateTime 2021/3/11 13:24
 * @Description
 */
@Configuration
public class MyConfig {

    @Bean
    public AllowHeaderFilter allowHeaderFilter(){
        return new AllowHeaderFilter();
    }
}
