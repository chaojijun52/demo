package com.example.dao;

import java.util.List;

import javax.persistence.EntityManager;

public interface CommonDao<T> {
	public List<T> getAll(EntityManager em, Class<T> clazz, String nativeQuerySql);
}
