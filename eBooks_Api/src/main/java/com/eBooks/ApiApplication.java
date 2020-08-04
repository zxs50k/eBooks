package com.eBooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: eBooks
 * @description
 * @author:
 * @create: 2020-08-03 20:26
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class,args);
    }
}
