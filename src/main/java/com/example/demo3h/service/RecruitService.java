package com.example.demo3h.service;

import com.example.demo3h.model.Recruit;

import java.util.List;

public interface RecruitService {
    /**
     * 查询招聘信息
     * */
    List<Recruit> selectAll();
}
