package com.grandcircus.Week6Capstone.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String email;
	private String password;
	
	@OneToMany(mappedBy="person", orphanRemoval = true)
	List<Task> tasks = new ArrayList<>();
	
	public Person()
	{
		
	}
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Person(String email, String password) {
		
		this.email = email;
		this.password = password;
	}


	public Person(Integer id, String email, String password) {
		this.id = id;
		this.email = email;
		this.password = password;
		tasks = null;
	}
	
	


	public List<Task> getTasks() {
		return tasks;
	}



	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	



	public Person(Integer id, String email, String password, List<Task> tasks) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.tasks = tasks;
	}



	public Person(String email, String password, List<Task> tasks) {
		super();
		this.email = email;
		this.password = password;
		this.tasks = tasks;
	}



	@Override
	public String toString() {
		return "id=" + id + "&email=" + email + "&password=" + password;
	}
	
	
	
	

}
