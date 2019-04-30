package com.example.tao.javaee_new.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Hello {
    @Autowired
    @ResponseBody
    @RequestMapping("/hhh")
    public String sayhello(){
        return "hello from javaee";
    }

    @RequestMapping("/succ")
    public String succ(){
        //直接返回页面
        return "/gugu";
    }

    @RequestMapping("/thy")
    public String thymeleaf(){
        //返回由thymeleaf的视图解析器来解析出来的页面
        return "/thyme";
    }

    @RequestMapping("/111")
    public String home(){
        //返回由thymeleaf的视图解析器来解析出来的页面
        return "/index";
    }

    @RequestMapping("/list")
    public String backlist(){
        //返回由thymeleaf的视图解析器来解析出来的页面
        return "/list";
    }
}
