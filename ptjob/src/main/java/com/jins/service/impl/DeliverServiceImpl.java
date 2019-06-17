package com.jins.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jins.dao.DeliverDao;
import com.jins.entity.Deliver;
import com.jins.service.DeliverService;

@Service
public class DeliverServiceImpl implements DeliverService {

	@Autowired
	DeliverDao deliverDao;

	@Override
	public int insert(Deliver t) {
		return deliverDao.insert(t);
	}

	@Override
	public int delete(int id) {
		return deliverDao.delete(id);
	}

	@Override
	public int update(Deliver t) {
		return deliverDao.update(t);
	}

	@Override
	public Deliver findById(int id) {
		return deliverDao.findById(id);
	}

	
	@Override
	public List<Deliver> findByJobId(Integer jobId) {
		return deliverDao.findByJobId(jobId);
	}

	@Override
	public List<Deliver> findAll() {
		return deliverDao.findAll();
	}

}
