package com.xywei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author future
 * @DateTime 2021/3/8 15:56
 * @Description
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayApplication9001 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication9001.class,args);
    }
}
