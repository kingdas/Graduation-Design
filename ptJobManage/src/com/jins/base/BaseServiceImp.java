package com.jins.base;

import java.util.List;

public abstract class BaseServiceImp<T> implements BaseService<T> {

	public abstract BaseDao<T> getDao();

	@Override
	public int add(T t) {
		return getDao().add(t);
	}

	@Override
	public int delete(int id) {
		return getDao().delete(id);
	}

	@Override
	public int update(T t) {
		return getDao().update(t);
	}

	@Override
	public T findById(int id) {
		return getDao().findById(id);
	}

	@Override
	public List<T> findAll() {
		return getDao().findAll();
	}
}
