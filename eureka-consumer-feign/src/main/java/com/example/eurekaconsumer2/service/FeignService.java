package com.example.eurekaconsumer2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: three-cloud
 * @Package: com.example.eurekaconsumer2.service
 * @ClassName: FeignService
 * @Description:
 * @Author: meihao
 * @CreateDate: 2019/1/22 16:52
 */
@FeignClient(value = "SERVICE-HI")
public interface FeignService {

    @RequestMapping("/get")
    String get();
}
