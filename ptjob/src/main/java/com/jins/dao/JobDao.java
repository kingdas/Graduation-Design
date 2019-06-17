package com.jins.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jins.base.BaseDao;
import com.jins.entity.Job;

@Mapper
public interface JobDao extends BaseDao<Job> {
	List<Job> findByCondition(@Param("jobName") String jobName, @Param("jobType") Integer jobType);

	List<Job> findByUserId(@Param("userId") Integer userId, @Param("jobName") String jobName,
			@Param("jobType") Integer jobType);

	int deleteBatch(Object[] ids);
	
	int findCounts(Integer userId);
}
