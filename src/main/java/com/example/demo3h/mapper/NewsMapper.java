package com.example.demo3h.mapper;

import com.example.demo3h.model.News;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer newsid);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer newsid);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
}