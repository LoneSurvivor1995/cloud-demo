package com.example.eurekaconsumer2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName: three-cloud
 * @Package: com.example.eurekaconsumer2.service
 * @ClassName: FeignController
 * @Description:
 * @Author: meihao
 * @CreateDate: 2019/1/22 16:55
 */

@RestController
public class FeignController {

    @Resource
    FeignService feignService;

    @RequestMapping("/get")
    public String get(){
        return feignService.get();
    }
}
