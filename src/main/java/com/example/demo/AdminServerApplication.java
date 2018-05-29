package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class AdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminServerApplication.class, args);
	}
}


//http://www.baeldung.com/spring-boot-admin
//https://github.com/eugenp/tutorials/tree/master/spring-boot-admin

//https://codecentric.github.io/spring-boot-admin/current/
//https://github.com/codecentric/spring-boot-admin
	
