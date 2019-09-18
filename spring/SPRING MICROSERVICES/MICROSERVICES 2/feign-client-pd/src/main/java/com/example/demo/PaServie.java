package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class PaServie {

	@Autowired
	DoctorClient doctorClient;
	@Autowired
	PatientClient patientClient;
	
	@HystrixCommand(fallbackMethod="getFallbackPatient")
	public ResponseEntity<?> getPatients(){
		return patientClient.getPatients();
	}
	
	@HystrixCommand(fallbackMethod="getFallbackDoctorBySpeciality")
	public ResponseEntity<?> getPatientsByDisease(String  disease){
		System.out.println(disease);
		return patientClient.getPatientsByDisease(disease);
	}
	
	@HystrixCommand(fallbackMethod="getFallbackDoctor")
	public ResponseEntity<?> getDoctors(){
		return doctorClient.getPatients();
	}
	
	@HystrixCommand(fallbackMethod="getFallbackDoctorBySpeciality")
	public ResponseEntity<?> getDoctorsBySpeciality(String  disease){
		return doctorClient.getPatientsByDisease(disease);
	}
	
	public ResponseEntity<?> getFallbackPatient() {
		return ResponseEntity.ok("not active");
	}
	
	public ResponseEntity<?> getFallbackDoctor() {
		return ResponseEntity.ok("not active");
	}
	
	public ResponseEntity<?> getFallbackDoctorBySpeciality(String disease) {
		return ResponseEntity.ok("not active");
	}
	
	
	
	
}
