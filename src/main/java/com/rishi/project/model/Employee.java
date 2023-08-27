package com.rishi.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//This class is the model for Employee.
@Entity
@Table(name= "employee")
public class Employee {
	
	//Auto generated Id attribute for employees.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//Attribute first_name stores first name value of the employee.
	@Column(name = "first_name")
	private String firstName;
	
	//Attribute last_name stores last name value of the employee.
	@Column(name = "last_name")
	private String lastName;
	
	//Attribute emailId stores email Id value of the employee.
	@Column(name = "emailId")
	private String emailId;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
