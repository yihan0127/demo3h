package com.example.demo3h.mapper;

import com.example.demo3h.model.Putresume;

public interface PutresumeMapper {
    int deleteByPrimaryKey(Integer putresumeid);

    int insert(Putresume record);

    int insertSelective(Putresume record);

    Putresume selectByPrimaryKey(Integer putresumeid);

    int updateByPrimaryKeySelective(Putresume record);

    int updateByPrimaryKey(Putresume record);
}