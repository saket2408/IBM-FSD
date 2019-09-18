package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="doctor-service")
public interface DoctorClient {
	
	@GetMapping("/doctors")
	public ResponseEntity<?> getPatients();
	
	@GetMapping("/doctors/{diseases}")
	public ResponseEntity<?> getPatientsByDisease(@PathVariable("diseases") String  disease);

}
