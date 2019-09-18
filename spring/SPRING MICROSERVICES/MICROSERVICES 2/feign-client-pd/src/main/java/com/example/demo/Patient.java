package com.example.demo;

public class Patient {

	
	private int id;
	private String patientName;
	private String patientDisease;
	public Patient() {
		super();
	}
	public Patient(String patientName, String patient_disease) {
		super();
		this.patientName = patientName;
		this.patientDisease = patient_disease;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientDisease() {
		return patientDisease;
	}
	public void setPatientDisease(String patient_disease) {
		this.patientDisease = patient_disease;
	}
	
}
