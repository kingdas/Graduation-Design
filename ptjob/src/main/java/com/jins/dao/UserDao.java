package com.jins.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jins.base.BaseDao;
import com.jins.entity.User;

@Mapper
public interface UserDao extends BaseDao<User> {
	List<User> findByCondition(@Param("userLoginName") String userLoginName,
			@Param("userPassword") String userPassword);
}
