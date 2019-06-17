package com.jins.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jins.dao.AdminDao;
import com.jins.entity.Admin;
import com.jins.service.AdminService;

@Service
public class AdminServiceImp implements AdminService {

	@Autowired
	private AdminDao admdao;

	@Override
	public List<Admin> findByCondition(Admin adm) {
		return admdao.findByCondition(adm);
	}

	@Override
	public int add(Admin t) {
		return admdao.add(t);
	}

	@Override
	public int delete(int id) {
		return admdao.delete(id);
	}

	@Override
	public int update(Admin t) {
		return admdao.update(t);
	}

	@Override
	public Admin findById(int id) {
		return admdao.findById(id);
	}

	@Override
	public List<Admin> findAll() {
		return admdao.findAll();
	}

}
