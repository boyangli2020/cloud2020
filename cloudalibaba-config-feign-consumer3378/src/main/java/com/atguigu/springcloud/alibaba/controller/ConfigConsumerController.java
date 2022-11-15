package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.alibaba.service.NacosConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class ConfigConsumerController {

    @Resource
    private NacosConfigService nacosConfigService;

    @GetMapping("/consumer/config/info")
    public String getConfigInfo() {
        return nacosConfigService.getConfigInfo();
    }

}
