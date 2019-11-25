package com.grandcircus.Week6Capstone.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grandcircus.Week6Capstone.model.Person;
import com.grandcircus.Week6Capstone.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

	List<Task> findByPerson(Person p);
	
}
