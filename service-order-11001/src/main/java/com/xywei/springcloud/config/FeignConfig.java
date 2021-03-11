package com.xywei.springcloud.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * @Author future
 * @DateTime 2021/3/11 13:43
 * @Description
 */
public class FeignConfig implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate template) {
        template.header("securitykey","my-gateway");
    }
}
