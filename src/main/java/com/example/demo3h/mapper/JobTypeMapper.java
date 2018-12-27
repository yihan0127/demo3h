package mapper;

import model.JobType;

public interface JobTypeMapper {
    int deleteByPrimaryKey(Integer jtid);

    int insert(JobType record);

    int insertSelective(JobType record);

    JobType selectByPrimaryKey(Integer jtid);

    int updateByPrimaryKeySelective(JobType record);

    int updateByPrimaryKey(JobType record);
}