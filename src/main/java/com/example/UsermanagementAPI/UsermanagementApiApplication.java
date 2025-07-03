package com.example.UsermanagementAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.UsermanagementAPI")
public class UsermanagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsermanagementApiApplication.class, args);
	}

}
