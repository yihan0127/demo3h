package com.example.demo3h.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class helloController {

    /**
     * 主界面
     * */
    @RequestMapping("/hello")
    public  String hello(){

        return "index";
    }

    /**
     * 二手市场界面
     * */
    @RequestMapping("/second")
    public  String second(){

        return "second";
    }
    /**
     * 生活服务界面
     * */
    @RequestMapping("/service")
    public  String service(){

        return "service";
    }

    /**
    * 互帮互助界面
    * */
    @RequestMapping("/help")
    public  String help(){

        return "help";
    }





}
