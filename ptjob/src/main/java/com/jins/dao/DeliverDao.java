package com.jins.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jins.base.BaseDao;
import com.jins.entity.Deliver;

@Mapper
public interface DeliverDao extends BaseDao<Deliver> {
	List<Deliver> findByJobId(Integer jobId);
}
