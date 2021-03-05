package com.xywei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author future
 * @DateTime 2021/2/27 22:40
 * @Description
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentApplication12003 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication12003.class, args);
    }
}
