package com.xywei.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author future
 * @DateTime 2021/3/8 18:16
 * @Description
 */
@RestController
public class GlobalFallBackController {

    @RequestMapping("/fallback")
    public String fallbackMessage(){
        return "服务不可到达，请稍后再试！";
    }
}
