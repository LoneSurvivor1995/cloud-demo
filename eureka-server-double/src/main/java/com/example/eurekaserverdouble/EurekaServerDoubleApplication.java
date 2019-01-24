package com.example.eurekaserverdouble;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerDoubleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerDoubleApplication.class, args);
	}

}

