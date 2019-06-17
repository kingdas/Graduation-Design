package com.jins.service;

import java.util.List;

import com.jins.base.BaseService;
import com.jins.entity.Deliver;

public interface DeliverService extends BaseService<Deliver> {
	List<Deliver> findByJobId(Integer jobId);
}
