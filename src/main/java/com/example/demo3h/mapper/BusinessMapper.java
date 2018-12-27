package mapper;

import model.Business;

public interface BusinessMapper {
    int deleteByPrimaryKey(Integer businessid);

    int insert(Business record);

    int insertSelective(Business record);

    Business selectByPrimaryKey(Integer businessid);

    int updateByPrimaryKeySelective(Business record);

    int updateByPrimaryKey(Business record);
}