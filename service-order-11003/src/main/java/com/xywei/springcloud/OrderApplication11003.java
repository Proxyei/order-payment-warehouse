package com.xywei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author future
 * @DateTime 2021/2/26 18:53
 * @Description
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderApplication11003 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication11003.class, args);
    }
}
