package com.example.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.query.internal.NativeQueryImpl;
import org.hibernate.transform.Transformers;
import com.example.view.PersonAndHobbies;

public class PersonAndHobbiesRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<PersonAndHobbies> getAllPersonAndHobbies(){
		System.out.println(this.entityManager==null?"NULL...":"NOT NULL...");
		String sql="select p.id as id, p.name as name, h.hobby as hobby, h.years as years from june_create_table p, hobbies h where p.id=h.pid";
		Query query=this.entityManager.createNativeQuery(sql);
		query.unwrap(NativeQueryImpl.class).setResultTransformer(Transformers.aliasToBean(PersonAndHobbies.class));
		return query.getResultList();
	}
}
