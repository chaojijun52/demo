package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Hobbies;

public interface HobbiesRepository extends CrudRepository<Hobbies, Integer> {
}
