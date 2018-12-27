package com.example.demo3h.mapper;

import com.example.demo3h.model.RecruitType;

public interface RecruitTypeMapper {
    int deleteByPrimaryKey(Integer rtid);

    int insert(RecruitType record);

    int insertSelective(RecruitType record);

    RecruitType selectByPrimaryKey(Integer rtid);

    int updateByPrimaryKeySelective(RecruitType record);

    int updateByPrimaryKey(RecruitType record);
}