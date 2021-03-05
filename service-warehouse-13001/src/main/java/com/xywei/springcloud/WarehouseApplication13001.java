package com.xywei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author future
 * @DateTime 2021/2/27 23:40
 * @Description
 */
@SpringBootApplication
@EnableEurekaClient
public class WarehouseApplication13001 {
    public static void main(String[] args) {
        SpringApplication.run(WarehouseApplication13001.class,args);
    }
}
