package com.jins.dao;

import java.util.List;

import com.jins.base.BaseDao;
import com.jins.entity.Admin;

public interface AdminDao extends BaseDao<Admin> {
	List<Admin> findByCondition(Admin adm);
}
