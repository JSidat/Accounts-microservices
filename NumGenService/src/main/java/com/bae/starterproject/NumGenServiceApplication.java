package com.bae.starterproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NumGenServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumGenServiceApplication.class, args);
	}

}
