package com.wh.producer1;

import com.wh.consumer1.RemoteProducerHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/producer1")
@FeignClient(name = "producer1", fallback = RemoteProducerHystrix.class)
public interface RemoteProducer1 {
    @GetMapping("/{id}")
    public Integer getId(@PathVariable("id") Integer id);
}
