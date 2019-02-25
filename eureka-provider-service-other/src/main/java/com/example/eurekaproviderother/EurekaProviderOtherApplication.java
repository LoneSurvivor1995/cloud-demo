package com.example.eurekaproviderother;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaProviderOtherApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderOtherApplication.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/set")
	public String set(){
		return "this is other provider = " + port;
	}

}

