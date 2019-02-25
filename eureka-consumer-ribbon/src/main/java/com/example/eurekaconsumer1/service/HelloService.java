package com.example.eurekaconsumer1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: three-cloud
 * @Package: com.example.eurekaconsumer1.service
 * @ClassName: HelloService
 * @Description:
 * @Author: meihao
 * @CreateDate: 2019/1/22 15:58
 */

@RestController
public class HelloService {


    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/get")
    public String sayHello(){
        String uri = "http://SERVICE-HI/get";
        return restTemplate.getForObject(uri,String.class);
    }

}
