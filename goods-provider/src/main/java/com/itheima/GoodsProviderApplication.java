package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GoodsProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsProviderApplication.class, args);
    }

}
