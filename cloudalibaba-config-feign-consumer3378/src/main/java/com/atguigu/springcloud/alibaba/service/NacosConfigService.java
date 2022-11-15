package com.atguigu.springcloud.alibaba.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "nacos-config-client")
public interface NacosConfigService {

    @GetMapping("/config/info")
    String getConfigInfo();

}
