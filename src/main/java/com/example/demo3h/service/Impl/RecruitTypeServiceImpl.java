package com.example.demo3h.service.Impl;

import com.example.demo3h.mapper.RecruitMapper;
import com.example.demo3h.model.RecruitType;
import com.example.demo3h.service.RecruitTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecruitTypeServiceImpl implements RecruitTypeService {
    @Autowired
    private RecruitMapper recruitMapper;
    @Override
    public List<RecruitType> selectRecruitType() {
        return null;
    }
}
