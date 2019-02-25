package com.example.eurekaconsumer8;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EurekaConsumer8Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumer8Application.class, args);
	}

	@Value("${name}")
	String name;

	@RequestMapping("/name")
	public String getName(){
		return name;
	}

}

