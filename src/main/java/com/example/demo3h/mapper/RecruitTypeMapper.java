package com.example.demo3h.mapper;

import com.example.demo3h.model.RecruitType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RecruitTypeMapper {
    int deleteByPrimaryKey(Integer rtid);

    int insert(RecruitType record);

    int insertSelective(RecruitType record);

    RecruitType selectByPrimaryKey(Integer rtid);

    int updateByPrimaryKeySelective(RecruitType record);

    int updateByPrimaryKey(RecruitType record);
    /**
     * 查看所有招聘类型
     * */
    @Select("SELECT * FROM `recruit_type`")
    List<RecruitType> selectRecruitType();
}