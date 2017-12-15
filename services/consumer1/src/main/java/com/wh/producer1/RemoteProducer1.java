package com.wh.producer1;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/producer1")
// 必须指定配置类，配置类用于实例化callback类
@FeignClient(name = "producer1", fallback = RemoteProducerHystrix.class, configuration = FeignConfiguration.class)
public interface RemoteProducer1 {
    @GetMapping("/{id}")
    public Integer getId(@PathVariable("id") Integer id);
}
