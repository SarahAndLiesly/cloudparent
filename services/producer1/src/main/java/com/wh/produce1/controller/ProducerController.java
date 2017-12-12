package com.wh.produce1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/producer1")
public class ProducerController {
    @GetMapping("/{id}")
    public Integer getId(@PathVariable Integer id) {
        return id;
    }
}
