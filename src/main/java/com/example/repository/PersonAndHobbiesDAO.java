package com.example.repository;

import java.util.List;

import javax.persistence.EntityManager;

import com.example.dao.CommonDao;
import com.example.dao.impl.CommonDaoImpl;
import com.example.view.PersonAndHobbies;

public class PersonAndHobbiesDAO {
	public List<PersonAndHobbies> getAllPersonAndHobbies(EntityManager em){
		CommonDao<PersonAndHobbies> dao=new CommonDaoImpl<PersonAndHobbies>();
		String sql="select p.id as id, p.name as name, h.hobby as hobby, h.years as years from june_create_table p, hobbies h where p.id=h.pid";
		return dao.getAll(em, PersonAndHobbies.class, sql);
	}
}
