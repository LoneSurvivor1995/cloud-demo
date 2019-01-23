package com.example.eurekaconsumer5;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaConsumer5Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumer5Application.class, args);
	}

	@Bean
	Sampler sampler(){
		return Sampler.ALWAYS_SAMPLE;
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/from")
	public String from(){
		return restTemplate.getForObject("http://zipkin-to/to",String.class);
	}

}

