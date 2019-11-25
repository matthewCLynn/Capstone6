package com.grandcircus.Week6Capstone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tasks")
public class Task {
	
	private String tDescription;
	private String tDueDate;
	private Boolean tComplete;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer tId;
	
	@ManyToOne
	private Person person;

	public String gettDescription() {
		return tDescription;
	}

	public void settDescription(String tDescription) {
		this.tDescription = tDescription;
	}

	public String gettDueDate() {
		return tDueDate;
	}

	public void settDueDate(String tDueDate) {
		this.tDueDate = tDueDate;
	}

	public Boolean gettComplete() {
		return tComplete;
	}

	public void settComplete(Boolean tComplete) {
		this.tComplete = tComplete;
	}

	public Integer gettId() {
		return tId;
	}

	public void settId(Integer tId) {
		this.tId = tId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Task(String tDescription, String tDueDate, Boolean tComplete, Integer tId, Person person) {
		super();
		this.tDescription = tDescription;
		this.tDueDate = tDueDate;
		this.tComplete = tComplete;
		this.tId = tId;
		this.person = person;
	}

	public Task(String tDescription, String tDueDate, Boolean tComplete, Person person) {
		super();
		this.tDescription = tDescription;
		this.tDueDate = tDueDate;
		this.tComplete = tComplete;
		this.person = person;
	}

	@Override
	public String toString() {
		return "Task [tDescription=" + tDescription + ", tDueDate=" + tDueDate + ", tComplete=" + tComplete + ", tId="
				+ tId + "]";
	}

	public Task() {
		super();
	}
	
	
	
	

}
