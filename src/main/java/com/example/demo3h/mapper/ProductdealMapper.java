package com.example.demo3h.mapper;

import com.example.demo3h.model.Productdeal;

public interface ProductdealMapper {
    int deleteByPrimaryKey(Integer productdealid);

    int insert(Productdeal record);

    int insertSelective(Productdeal record);

    Productdeal selectByPrimaryKey(Integer productdealid);

    int updateByPrimaryKeySelective(Productdeal record);

    int updateByPrimaryKey(Productdeal record);
}