package com.eBooks;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: eBooks
 * @description
 * @author:
 * @create: 2020-08-03 19:35
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.eBooks.dao")
@EnableTransactionManagement
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
