package com.jins.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jins.dao.UserDao;
import com.jins.entity.User;
import com.jins.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public int insert(User t) {
		return userDao.insert(t);
	}

	@Override
	public int delete(int id) {
		return userDao.delete(id);
	}

	@Override
	public int update(User t) {
		return userDao.update(t);
	}

	@Override
	public User findById(int id) {
		return userDao.findById(id);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public List<User> findByCondition(String userLoginName, String userPassword) {

		return userDao.findByCondition(userLoginName, userPassword);
	}

}
