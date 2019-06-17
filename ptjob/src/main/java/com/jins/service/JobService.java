package com.jins.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jins.base.BaseService;
import com.jins.entity.Job;

public interface JobService extends BaseService<Job> {

	List<Job> findByCondition(@Param("jobName") String jobName, @Param("jobType") Integer jobType);

	List<Job> findByUserId(@Param("userId") Integer userId, @Param("jobName") String jobName,
			@Param("jobType") Integer jobType);

	int deleteBatch(Object[] ids);

	int findCounts(Integer userId);
}
