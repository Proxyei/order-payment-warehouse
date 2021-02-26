package com.xywei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author future
 * @DateTime 2021/2/26 14:04
 * @Description
 */
@SpringBootApplication
@EnableEurekaServer
public class Register10002 {
    public static void main(String[] args) {
        SpringApplication.run(Register10002.class,args);
    }

}
