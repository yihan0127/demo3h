package com.example.demo3h.mapper;

import com.example.demo3h.model.Porduct;

public interface PorductMapper {
    int deleteByPrimaryKey(Integer proid);

    int insert(Porduct record);

    int insertSelective(Porduct record);

    Porduct selectByPrimaryKey(Integer proid);

    int updateByPrimaryKeySelective(Porduct record);

    int updateByPrimaryKey(Porduct record);
}