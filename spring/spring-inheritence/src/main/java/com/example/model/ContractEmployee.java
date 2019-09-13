package com.example.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "contract_employee")
public class ContractEmployee extends Employee {
	private String payPerHour;
	private String contractPeriod;
	public ContractEmployee() {
		super();
	}
	public ContractEmployee(String firstName,String lastName, String email,String payPerHour, String contractPeriod) {
		super(firstName, lastName, email);
		this.payPerHour = payPerHour;
		this.contractPeriod = contractPeriod;
	}
	public String getPayPerHour() {
		return payPerHour;
	}
	public void setPayPerHour(String payPerHour) {
		this.payPerHour = payPerHour;
	}
	public String getContractPeriod() {
		return contractPeriod;
	}
	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
	

}
