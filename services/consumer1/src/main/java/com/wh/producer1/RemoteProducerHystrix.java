package com.wh.producer1;

import org.springframework.web.bind.annotation.PathVariable;

//@Component 不用添加该注解，添加后有可能造成造成与接口重叠
public class RemoteProducerHystrix implements RemoteProducer1 {
    public Integer getId(@PathVariable("id") Integer id) {
        return 127;
    }
}
