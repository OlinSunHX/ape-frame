package com.jingdianjichi.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@MapperScan(value = "com.jingdianjichi.*.mapper")
@ComponentScan(value = "com.jingdianjichi")
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }

}
