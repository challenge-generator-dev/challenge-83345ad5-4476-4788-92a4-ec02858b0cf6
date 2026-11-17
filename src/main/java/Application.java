package com.example.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.orders")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}