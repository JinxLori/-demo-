package com.example.demo.controller;

import com.example.demo.config.AbcConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:IndexController
 * Package:com.bjpowernode.springboot.web
 * Description:
 *
 * @date:2020/3/5 10:52
 * @author:蛙课网
 */
@Controller
public class IndexController {

    @Value("${wsh.appid}")
    private String appid;

    @Value("${tempFilePath}")
    private String tempFilePath;

    @Autowired
    private AbcConfig abcConfig;

    @RequestMapping(value = "/say")
    public @ResponseBody String say() {

        return "Say:Hello " + appid + "+" + tempFilePath + "....." + abcConfig.getName() + "+++" + abcConfig.getTitle();
    }
}
