package com.jins.service;

import java.util.List;

import com.jins.base.BaseService;
import com.jins.entity.Admin;

public interface AdminService extends BaseService<Admin> {
	List<Admin> findByCondition(Admin adm);
}
