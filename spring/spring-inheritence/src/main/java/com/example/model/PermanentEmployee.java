package com.example.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "permanent_employee")
public class PermanentEmployee extends Employee {

	int salary;
	int conpensation;
	public PermanentEmployee() {
		super();
	}
	public PermanentEmployee(String firstName,String lastName, String email,int salary) {
		super(firstName, lastName, email);
		this.salary = salary;
		this.conpensation=salary/10;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getConpensation() {
		return conpensation;
	}
	public void setConpensation(int conpensation) {
		this.conpensation = conpensation;
	}
	
}
