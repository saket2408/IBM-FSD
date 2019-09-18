package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

	@Autowired
	PatientRepository patientRepository;
	
	@GetMapping("/patients")
	public ResponseEntity<?> getPatients(){
		return ResponseEntity.ok(patientRepository.findAll());
	}
	
	@GetMapping("/patients/{diseases}")
	public ResponseEntity<?> getPatientsByDisease(@PathVariable("diseases") String  disease){
		return ResponseEntity.ok(patientRepository.findByPatientDisease(disease));
	}
	
	
}
