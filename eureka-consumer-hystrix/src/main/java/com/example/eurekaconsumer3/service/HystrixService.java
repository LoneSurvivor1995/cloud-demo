package com.example.eurekaconsumer3.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: three-cloud
 * @Package: com.example.eurekaconsumer3.service
 * @ClassName: HystrixService
 * @Description:
 * @Author: meihao
 * @CreateDate: 2019/1/22 17:18
 */
@Service
public class HystrixService {

    @Autowired
    RestTemplate restTemplate;

    int a = 0;

    @HystrixCommand(fallbackMethod = "fallBack")
    public String get(){
        if (a++ %3 == 0){
            throw new RuntimeException();
        }
        return restTemplate.getForObject("http://SERVICE-HI/get",String.class);
    }

    public String fallBack(){
        return "sorry , it is error !";
    }

}
