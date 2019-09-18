package com.example.demo;

public class Doctor {

	
	private int id;
	private String doctorName;
	private String doctorSpeciality;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorSpeciality() {
		return doctorSpeciality;
	}

	public void setDoctorSpeciality(String doctorSpeciality) {
		this.doctorSpeciality = doctorSpeciality;
	}

	public Doctor() {
		super();
	}

	public Doctor(String doctorName, String doctorSpeciality) {
		super();
		this.doctorName = doctorName;
		this.doctorSpeciality = doctorSpeciality;
	}
	
	
}
