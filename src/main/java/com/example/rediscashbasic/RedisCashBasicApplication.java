package com.example.rediscashbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching //캐싱 어노테이션의 사용을 인식
@SpringBootApplication
public class RedisCashBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisCashBasicApplication.class, args);
    }

}
