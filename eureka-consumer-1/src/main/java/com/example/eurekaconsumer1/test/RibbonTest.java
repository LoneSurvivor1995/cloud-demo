package com.example.eurekaconsumer1.test;

import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: three-cloud
 * @Package: com.example.eurekaconsumer1.test
 * @ClassName: RibbonTest
 * @Description:
 * @Author: meihao
 * @CreateDate: 2019/1/22 16:14
 */
public class RibbonTest {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String uri = "http://SERVICE-HI";
        String str = restTemplate.getForObject(uri,String.class);
        System.out.println(str);
    }
}
