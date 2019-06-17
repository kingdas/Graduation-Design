package com.jins.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jins.base.BaseService;
import com.jins.entity.User;

public interface UserService extends BaseService<User> {
	List<User> findByCondition(@Param("userLoginName") String userLoginName,
			@Param("userPassword") String userPassword);
}
