package com.example.springbootrabbitmq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.springbootrabbitmq.mapper"})
public class SpringbootRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRabbitmqApplication.class, args);
    }

}
