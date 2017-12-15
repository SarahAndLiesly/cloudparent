package com.wh.producer1;

import org.springframework.context.annotation.Bean;

//@Configuration 配置类不用添加该注解，在Feign接口指定该类就可以了
public class FeignConfiguration {
    @Bean
    public RemoteProducerHystrix getRemoteProducerHystrix() {
        return new RemoteProducerHystrix();
    }
}
