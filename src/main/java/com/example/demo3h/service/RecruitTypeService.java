package com.example.demo3h.service;

import com.example.demo3h.model.RecruitType;

import java.util.List;

public interface RecruitTypeService {
    /**
     * 查看所有招聘类型
     * */
    List<RecruitType> selectRecruitType();
}
