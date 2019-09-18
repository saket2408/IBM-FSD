package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "patient-service")
public interface PatientClient {

	@GetMapping("/patients")
	public ResponseEntity<?> getPatients();
	
	@GetMapping("/patients/{diseases}")
	public ResponseEntity<?> getPatientsByDisease(@PathVariable("diseases") String  disease);
}
