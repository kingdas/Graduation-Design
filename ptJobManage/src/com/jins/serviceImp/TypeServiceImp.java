package com.jins.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jins.base.BaseDao;
import com.jins.base.BaseServiceImp;
import com.jins.dao.TypeDao;
import com.jins.entity.Type;
import com.jins.service.TypeService;

@Service
public class TypeServiceImp extends BaseServiceImp<Type> implements TypeService {

	@Autowired
	private TypeDao tdao;

	@Override
	public BaseDao<Type> getDao() {
		return tdao;
	}
}
