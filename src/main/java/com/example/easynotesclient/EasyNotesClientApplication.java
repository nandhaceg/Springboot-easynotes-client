package com.example.easynotesclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EasyNotesClientApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EasyNotesClientApplication.class, args);
	}
}
