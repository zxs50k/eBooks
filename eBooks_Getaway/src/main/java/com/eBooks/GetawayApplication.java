package com.eBooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: eBooks
 * @description
 * @author:
 * @create: 2020-08-03 19:48
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class GetawayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GetawayApplication.class,args);
    }
}
