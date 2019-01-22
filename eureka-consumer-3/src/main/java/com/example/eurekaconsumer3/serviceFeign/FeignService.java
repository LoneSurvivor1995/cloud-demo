package com.example.eurekaconsumer3.serviceFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: three-cloud
 * @Package: com.example.eurekaconsumer3.serviceFeign
 * @ClassName: FeignService
 * @Description:
 * @Author: meihao
 * @CreateDate: 2019/1/22 17:37
 */

@FeignClient(value = "SERVICE-HI",fallback = FeignFallback.class)
public interface FeignService {

    @RequestMapping("/get")
    String get();
}
