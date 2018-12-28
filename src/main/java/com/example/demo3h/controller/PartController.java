package com.example.demo3h.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PartController {


    /**
     * 兼职界面
     * */
    @RequestMapping("/part")
    public  String part(){

        return "part";
    }
}
