package com.example.demo3h.controller;

import com.example.demo3h.model.RecruitType;
import com.example.demo3h.service.RecruitTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class RecruitTypeController {
    @Autowired
    private RecruitTypeService recruitTypeService;

    public List<RecruitType> RecruitType(){
        List<RecruitType> recruitTypes=recruitTypeService.selectRecruitType();
        return recruitTypes;
    }

}
