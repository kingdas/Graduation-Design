package com.jins.base;

import java.util.List;

public interface BaseService<T> {
	int insert(T t);

	int delete(int id);

	int update(T t);

	T findById(int id);

//	List<T> findByCondition(T t);

	List<T> findAll();
}
