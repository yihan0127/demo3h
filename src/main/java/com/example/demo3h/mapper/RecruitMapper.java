package com.example.demo3h.mapper;

import com.example.demo3h.model.Recruit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RecruitMapper {
    int deleteByPrimaryKey(Integer recruitid);

    int insert(Recruit record);

    int insertSelective(Recruit record);

    Recruit selectByPrimaryKey(Integer recruitid);

    int updateByPrimaryKeySelective(Recruit record);

    int updateByPrimaryKey(Recruit record);
    @Select("SELECT  *  FROM  `recruit`")
    List<Recruit> selectAll();
}