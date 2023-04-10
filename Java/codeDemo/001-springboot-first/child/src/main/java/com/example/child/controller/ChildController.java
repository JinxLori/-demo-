package com.example.child.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChildController {
    @RequestMapping(value = "/child")
    public String say() {
        return "Hello,com.example.child!";
    }
}
