package com.example.demo3h.service.Impl;

import com.example.demo3h.mapper.RecruitMapper;
import com.example.demo3h.model.Recruit;
import com.example.demo3h.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecruitServiceImpl implements RecruitService {
    @Autowired
    private RecruitMapper recruitMapper;

    @Override
    public List<Recruit> selectAll() {
        return recruitMapper.selectAll();
    }
}
