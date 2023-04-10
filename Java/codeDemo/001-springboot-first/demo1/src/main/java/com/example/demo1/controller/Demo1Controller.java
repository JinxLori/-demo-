package com.example.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {

    @RequestMapping(value = "/demo1")
    public String say() {
        return "Hello,demo1!";
    }
}

