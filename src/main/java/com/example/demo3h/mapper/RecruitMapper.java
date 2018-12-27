package com.example.demo3h.mapper;

import com.example.demo3h.model.Recruit;

public interface RecruitMapper {
    int deleteByPrimaryKey(Integer recruitid);

    int insert(Recruit record);

    int insertSelective(Recruit record);

    Recruit selectByPrimaryKey(Integer recruitid);

    int updateByPrimaryKeySelective(Recruit record);

    int updateByPrimaryKey(Recruit record);
}