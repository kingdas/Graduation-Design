package com.jins.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jins.dao.JobDao;
import com.jins.entity.Job;
import com.jins.service.JobService;

@Service
public class JobServiceImpl implements JobService {

	@Autowired
	JobDao jobDao;

	@Override
	public int insert(Job t) {
		return jobDao.insert(t);
	}

	@Override
	public int delete(int id) {
		return jobDao.delete(id);
	}

	@Override
	public int update(Job t) {
		return jobDao.update(t);
	}

	@Override
	public Job findById(int id) {
		return jobDao.findById(id);
	}

	@Override
	public List<Job> findByCondition(String jobName, Integer jobType) {

		return jobDao.findByCondition(jobName, jobType);
	}

	@Override
	public List<Job> findAll() {
		return jobDao.findAll();
	}

	@Override
	public List<Job> findByUserId(Integer userId, String jobName, Integer jobType) {
		return jobDao.findByUserId(userId, jobName, jobType);
	}

	@Override
	public int deleteBatch(Object[] ids) {
		return jobDao.deleteBatch(ids);
	}

	@Override
	public int findCounts(Integer userId) {
		return jobDao.findCounts(userId);
	}

}
