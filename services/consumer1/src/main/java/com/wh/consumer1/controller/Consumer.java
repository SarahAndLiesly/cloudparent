package com.wh.consumer1.controller;

import com.wh.producer1.RemoteProducer1;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consumer1")
@RefreshScope
public class Consumer {

    @Autowired
    RemoteProducer1 remoteProducer1;

    @GetMapping("/{id}")
    @ApiOperation(value = "测试服务调用", notes = "服务调用及降级")
    public Integer getId(@ApiParam(value = "随便", name = "any", required = true) @PathVariable Integer id) {
        return remoteProducer1.getId(id);
    }

    @Value("${var}")
    private String var;

    @ApiOperation(value = "测试配置中心", notes = "获取配置中心配置信息")
    @GetMapping("/config")
    public String getConfig() {
        return var;
    }
}
