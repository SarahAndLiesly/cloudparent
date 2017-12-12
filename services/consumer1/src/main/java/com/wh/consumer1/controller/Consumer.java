package com.wh.consumer1.controller;

import com.wh.producer1.RemoteProducer1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consumer1")
public class Consumer {

    @Autowired
    RemoteProducer1 remoteProducer1;

    @GetMapping("/{id}")
    public Integer getId(@PathVariable Integer id) {
        return remoteProducer1.getId(id);
    }
}
