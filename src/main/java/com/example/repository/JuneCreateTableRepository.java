package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.JuneCreateTable;

@Repository
public interface JuneCreateTableRepository extends CrudRepository<JuneCreateTable, Integer> {
	
}
