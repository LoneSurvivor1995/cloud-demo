package com.example.eurekaconsumer7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EurekaConsumer7Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumer7Application.class, args);
	}

}

