package mapper;

import model.RecruitType;

public interface RecruitTypeMapper {
    int deleteByPrimaryKey(Integer rtid);

    int insert(RecruitType record);

    int insertSelective(RecruitType record);

    RecruitType selectByPrimaryKey(Integer rtid);

    int updateByPrimaryKeySelective(RecruitType record);

    int updateByPrimaryKey(RecruitType record);
}