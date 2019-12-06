package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.Hobbies;
import com.example.entity.JuneCreateTable;
import com.example.repository.HobbiesRepository;
import com.example.repository.JuneCreateTableRepository;

@Controller
@RequestMapping(path="/hobbies")
public class HobbiesController {
@Autowired
private HobbiesRepository hobbiesRepository;
@Autowired
private JuneCreateTableRepository juneCreateTableRepository;

@GetMapping(path="/all")
public @ResponseBody Iterable<Hobbies> getAllHobbies() {
	return this.hobbiesRepository.findAll();
}

@PostMapping(path="/add/{pid}")
public @ResponseBody String addNewHobby(@PathVariable("pid") Integer pid, @RequestBody Hobbies hobby) {
	Optional<JuneCreateTable> person=this.juneCreateTableRepository.findById(pid);
	hobby.setJuneCreateTable(person.orElse(null));
	this.hobbiesRepository.save(hobby);
	return "saved";
}
}
