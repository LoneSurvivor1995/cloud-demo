package com.example.eurekaconsumer9;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@EnableHystrix
@EnableHystrixDashboard
@EnableEurekaClient
public class EurekaConsumer9Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumer9Application.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@Bean
	public ServletRegistrationBean servletRegistrationBean(){
		HystrixMetricsStreamServlet hystrixMetricsStreamServlet = new HystrixMetricsStreamServlet();
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(hystrixMetricsStreamServlet);
		servletRegistrationBean.setLoadOnStartup(1);
		servletRegistrationBean.setName("ServletRegistrationBean");
		servletRegistrationBean.addUrlMappings("/actuator/hystrix.stream");
		return servletRegistrationBean;
	}

}

