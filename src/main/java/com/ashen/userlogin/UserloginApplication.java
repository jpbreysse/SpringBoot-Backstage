package com.ashen.userlogin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.ashen.userlogin.dao")
@SpringBootApplication
public class UserloginApplication {

    public static void main(String[] args) {

        SpringApplication.run(UserloginApplication.class, args);
    }

}
