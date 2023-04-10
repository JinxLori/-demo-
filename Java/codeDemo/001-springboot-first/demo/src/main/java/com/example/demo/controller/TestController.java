package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class TestController {

    @RequestMapping(value = "/springboot/say")
//    @ResponseBody
    public String say() {
        return "Hello,SpringBoot!";
    }

    @RequestMapping(value = "/springboot/param")
    public String sayParams(String massage) { // 带参数 /springboot/param?massage=“123”
        return "Hello,SpringBoot!" + massage;
    }
}

