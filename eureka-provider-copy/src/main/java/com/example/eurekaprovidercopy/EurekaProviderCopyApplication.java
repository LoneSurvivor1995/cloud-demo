package com.example.eurekaprovidercopy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaProviderCopyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderCopyApplication.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/get")
	public String get(){
		return "this is provider copy ! "+port;
	}

}

