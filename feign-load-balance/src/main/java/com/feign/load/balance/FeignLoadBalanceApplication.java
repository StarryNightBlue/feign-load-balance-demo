package com.feign.load.balance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignLoadBalanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignLoadBalanceApplication.class, args);
    }

}
