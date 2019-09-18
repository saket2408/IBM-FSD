package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaController {
@Autowired
	PaServie service;
	
	@GetMapping("/patients")
	public ResponseEntity<?> getPatients(){
		return service.getPatients();
	}
	
	@GetMapping("/patients/{id}")
	public ResponseEntity<?> getPatientsByDisease(@PathVariable("id") String disease){
		System.out.println(disease);
		return service.getPatientsByDisease(disease);
	}
	
	@GetMapping("/doctors")
	public ResponseEntity<?> getDoctors(){
		return service.getDoctors();
	}
	
	@GetMapping("/doctors/{id}")
	public ResponseEntity<?> getDoctorsBySpeciality(@PathVariable("id") String disease){
		return service.getDoctorsBySpeciality(disease);
	}
}
