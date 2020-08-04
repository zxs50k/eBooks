package com.eBooks.config;


import com.eBooks.util.JedisCore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JedisConfig {
    @Value("${eBooks_Api.redis.host}")
    private String host;
    @Value("${eBooks_Api.redis.port}")
    private int port;
    @Value("${eBooks_Api.redis.pass}")
    private String pass;

    @Bean
    public JedisCore createJc(){
        return new JedisCore(host,port,pass);
    }


}
