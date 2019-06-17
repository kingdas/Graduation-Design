package com.jins.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jins.dao.JobTypeDao;
import com.jins.entity.JobType;
import com.jins.service.JobTypeService;

@Service
public class JobTypeServiceImpl implements JobTypeService {

	@Autowired
	JobTypeDao jobTypeDao;

	@Override
	public int insert(JobType t) {
		return jobTypeDao.insert(t);
	}

	@Override
	public int delete(int id) {
		return jobTypeDao.delete(id);
	}

	@Override
	public int update(JobType t) {
		return jobTypeDao.update(t);
	}

	@Override
	public JobType findById(int id) {
		return jobTypeDao.findById(id);
	}

	@Override
	public List<JobType> findAll() {
		return jobTypeDao.findAll();
	}

}
