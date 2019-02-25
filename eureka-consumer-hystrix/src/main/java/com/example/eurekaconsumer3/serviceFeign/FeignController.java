package com.example.eurekaconsumer3.serviceFeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName: three-cloud
 * @Package: com.example.eurekaconsumer3.serviceFeign
 * @ClassName: FeignController
 * @Description:
 * @Author: meihao
 * @CreateDate: 2019/1/22 17:42
 */

@RestController
public class FeignController {

    @Resource
    FeignService feignService;

    @RequestMapping("/getFeign")
    public String get(){
        return feignService.get();
    }
}
