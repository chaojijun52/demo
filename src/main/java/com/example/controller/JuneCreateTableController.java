package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.JuneCreateTable;
import com.example.repository.JuneCreateTableRepository;

@Controller
@RequestMapping(path="/junecreatetable")
public class JuneCreateTableController {
@Autowired
private JuneCreateTableRepository juneCreateTableRepository;

@GetMapping(path="/all")
public @ResponseBody Iterable<JuneCreateTable> getAll(){
	return this.juneCreateTableRepository.findAll();
}
}
