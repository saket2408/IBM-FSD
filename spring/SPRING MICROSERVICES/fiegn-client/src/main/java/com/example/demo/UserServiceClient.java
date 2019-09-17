package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@FeignClient(name = "user-ws")
public interface UserServiceClient {

	@GetMapping("/users")
	public List<?> getUsers();
	
	@GetMapping("/users/{id}")
	public ResponseEntity<?> findUser(@PathVariable("id") String userID);
	
}
