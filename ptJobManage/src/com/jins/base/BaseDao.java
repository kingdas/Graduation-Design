package com.jins.base;

import java.util.List;

public interface BaseDao<T> {

	int add(T t);
	
	int delete(int id);
	
	int update(T t);
	
	T findById(int id);
	
	List<T> findAll();
}
