package com.xywei.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author future
 * @DateTime 2021/3/10 17:23
 * @Description
 */
//@RefreshScope
@RestController
public class TestBusConfigController {
    @Value("${test.info}")
    private String info;

    @GetMapping("/myinfo")
    public String getPort(){
        return info;
    }

}
