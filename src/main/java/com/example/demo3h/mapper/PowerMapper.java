package com.example.demo3h.mapper;

import com.example.demo3h.model.Power;

public interface PowerMapper {
    int deleteByPrimaryKey(Integer powerid);

    int insert(Power record);

    int insertSelective(Power record);

    Power selectByPrimaryKey(Integer powerid);

    int updateByPrimaryKeySelective(Power record);

    int updateByPrimaryKey(Power record);
}