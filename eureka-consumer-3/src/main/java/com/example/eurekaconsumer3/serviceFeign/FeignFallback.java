package com.example.eurekaconsumer3.serviceFeign;

import org.springframework.stereotype.Service;

/**
 * @ProjectName: three-cloud
 * @Package: com.example.eurekaconsumer3.serviceFeign
 * @ClassName: FeignFallback
 * @Description:
 * @Author: meihao
 * @CreateDate: 2019/1/22 17:40
 */

@Service
public class FeignFallback implements FeignService {
    @Override
    public String get() {
        return "sorry ,this is FeignFallback class !";
    }
}
