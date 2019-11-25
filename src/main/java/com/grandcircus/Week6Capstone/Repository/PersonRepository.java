package com.grandcircus.Week6Capstone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grandcircus.Week6Capstone.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

	Person findByEmail(String email);
	
	Person findByPassword(String password);
}
