package com.example.demo3h.controller;

import com.example.demo3h.model.Recruit;
import com.example.demo3h.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FullController {
    @Autowired
    private RecruitService recruitService;

    /**
     * 全职界面
     * */
    @RequestMapping("/full")
    public  String full(Model model){
        List<Recruit> recruits = recruitService.selectAll();
        model.addAttribute("recruits",recruits);
        return "full";
    }
}
