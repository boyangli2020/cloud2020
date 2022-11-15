package com.atguigu.springcloud.alibaba.controller;

import com.alibaba.fastjson.JSON;
import com.atguigu.springcloud.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderNacosController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverUrl;

    @GetMapping("/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(serverUrl + "/payment/nacos/" + id, String.class);
    }

    @GetMapping("/consumer/testA")
    public String testA() {
        String result = null;
        try {
            result = restTemplate.getForObject("http://cloudalibaba-sentinel-service/testA", String.class);
            System.out.println("返回信息:" + result);
        } catch (Exception e) {
            return "异常了";
        }
        return result;
    }

    @GetMapping("/consumer/testHotKey")
    public String testHotKey() {
        String result = null;
        try {
            result = restTemplate.getForObject("http://cloudalibaba-sentinel-service/testHotKey?p1=1", String.class);
            System.out.println("返回信息:" + result);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
            return "异常了";
        }
        return result;
    }

    @GetMapping("/consumer/byResource")
    public CommonResult byResource() {
        CommonResult result = null;
        try {
            result = restTemplate.getForObject("http://cloudalibaba-sentinel-service/byResource", CommonResult.class);
            System.out.println("返回信息:" + JSON.toJSONString(result));
        } catch (Exception e) {
            System.out.println("exception name:" +e.getClass().getSimpleName());
            e.printStackTrace();
        }
        return result;
    }

}
