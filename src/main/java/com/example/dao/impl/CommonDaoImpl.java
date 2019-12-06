package com.example.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.query.internal.NativeQueryImpl;
import org.hibernate.transform.Transformers;

import com.example.dao.CommonDao;

public class CommonDaoImpl<T> implements CommonDao<T> {

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll(EntityManager em, Class<T> clazz, String nativeQuerySql) {
		// TODO Auto-generated method stub
		Query query=em.createNativeQuery(nativeQuerySql);
		query.unwrap(NativeQueryImpl.class).setResultTransformer(Transformers.aliasToBean(clazz));
		return query.getResultList();
	}

}
