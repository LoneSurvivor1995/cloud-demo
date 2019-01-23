package com.example.eurekaconsumer6;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
public class EurekaConsumer6Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumer6Application.class, args);
	}

	@Value("${server.port}")
	String port;

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

	@RequestMapping("/to")
	public String to(){
		return restTemplate.getForObject("http://service-hi/get",String.class)+" === this port: "+port;
	}

}

