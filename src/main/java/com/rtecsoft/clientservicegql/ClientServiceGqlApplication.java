package com.rtecsoft.clientservicegql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientServiceGqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientServiceGqlApplication.class, args);
	}

}
