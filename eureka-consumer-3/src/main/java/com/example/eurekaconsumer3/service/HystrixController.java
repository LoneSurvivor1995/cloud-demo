package com.example.eurekaconsumer3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: three-cloud
 * @Package: com.example.eurekaconsumer3.service
 * @ClassName: HystrixController
 * @Description:
 * @Author: meihao
 * @CreateDate: 2019/1/22 17:25
 */

@RestController
public class HystrixController {

    @Autowired
    HystrixService hystrixService;

    @RequestMapping("/get")
    public String get(){
        return hystrixService.get();
    }
}
