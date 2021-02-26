package com.xywei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author future
 * @DateTime 2021/2/26 13:36
 * @Description
 */
@SpringBootApplication
@EnableEurekaServer
public class Register10001 {
    public static void main(String[] args) {
        SpringApplication.run(Register10001.class, args);
    }
}
