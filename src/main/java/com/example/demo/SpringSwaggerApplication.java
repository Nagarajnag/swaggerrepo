package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.nt.controller")
public class SpringSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSwaggerApplication.class, args);
	}
}
