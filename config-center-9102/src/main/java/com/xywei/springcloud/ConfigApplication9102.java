package com.xywei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author future
 * @DateTime 2021/3/9 17:07
 * @Description
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigApplication9102 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication9102.class,args);
    }
}
