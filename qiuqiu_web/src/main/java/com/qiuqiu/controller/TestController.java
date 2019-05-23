package com.qiuqiu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "spring项目启动";
    }
    @RequestMapping("/index")
    public String TestIndex(){
        return "index";
    }
}
