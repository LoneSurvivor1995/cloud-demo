package com.example.eurekaconsumer9.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: cloud-demo
 * @Package: com.example.eurekaconsumer9.service
 * @ClassName: HystrixController
 * @Description:
 * @Author: meihao
 * @CreateDate: 2019/1/24 17:02
 */

@RestController
public class HystrixController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/get")
    public String get(){
        return restTemplate.getForObject("http://service-hi/get",String.class);
    }
}
