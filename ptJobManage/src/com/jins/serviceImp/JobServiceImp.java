package com.jins.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jins.base.BaseDao;
import com.jins.base.BaseServiceImp;
import com.jins.dao.JobDao;
import com.jins.entity.Job;
import com.jins.service.JobService;

@Service
public class JobServiceImp extends BaseServiceImp<Job> implements JobService{

	@Autowired
	private JobDao jdao;
	
	@Override
	public BaseDao<Job> getDao() {
		return jdao;
	}

}
