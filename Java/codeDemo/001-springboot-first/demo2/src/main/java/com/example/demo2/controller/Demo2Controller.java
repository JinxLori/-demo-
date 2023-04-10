package com.example.demo2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2Controller {

    @RequestMapping(value = "/demo2")
    public String say() {
        return "Hello,com.example.demo2!";
    }
}

