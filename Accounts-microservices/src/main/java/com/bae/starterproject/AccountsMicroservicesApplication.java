package com.bae.starterproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountsMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsMicroservicesApplication.class, args);
	}

}
