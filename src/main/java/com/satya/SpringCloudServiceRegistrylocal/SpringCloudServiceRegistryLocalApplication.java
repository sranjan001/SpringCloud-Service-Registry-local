package com.satya.SpringCloudServiceRegistrylocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudServiceRegistryLocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceRegistryLocalApplication.class, args);
	}

}
