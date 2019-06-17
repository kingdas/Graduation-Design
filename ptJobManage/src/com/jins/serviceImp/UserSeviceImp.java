package com.jins.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jins.base.BaseDao;
import com.jins.base.BaseServiceImp;
import com.jins.dao.UserDao;
import com.jins.entity.User;
import com.jins.service.UserService;

@Service
public class UserSeviceImp extends BaseServiceImp<User> implements UserService {

	@Autowired
	private UserDao udao;

	@Override
	public BaseDao<User> getDao() {
		return udao;
	}

}
