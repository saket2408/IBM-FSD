package com.example.demo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.UserRequestModel;

@FeignClient(name = "user-ws" , url = "http://localhost:8070")
public interface UserServiceClient {
	
	@PostMapping("/users")
	public ResponseEntity<?> createUser(@RequestBody UserRequestModel userDetail);
	
	@GetMapping("/users")
	public List<?> getUsers();
	
	@GetMapping("/users/{id}")
	public ResponseEntity<?> findUser(@PathVariable("id") String userID);
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable("id") String userID);
	
	@PutMapping("/users/{id}")
	public ResponseEntity<?> updateUser(@RequestBody UserRequestModel userDetail,@PathVariable("id") String userID);

}
