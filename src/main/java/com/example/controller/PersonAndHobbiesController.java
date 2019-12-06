package com.example.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.repository.PersonAndHobbiesDAO;
import com.example.view.PersonAndHobbies;

@Controller
@RequestMapping(path = "/person_hobbies")
public class PersonAndHobbiesController {
	@PersistenceContext
	private EntityManager entityManager;

	private PersonAndHobbiesDAO personAndHobbiesRepository = new PersonAndHobbiesDAO();

	@GetMapping(path = "/all")
	public @ResponseBody List<PersonAndHobbies> getAllPersonAndHobbies() {
		return this.personAndHobbiesRepository.getAllPersonAndHobbies(this.entityManager);
	}
}
