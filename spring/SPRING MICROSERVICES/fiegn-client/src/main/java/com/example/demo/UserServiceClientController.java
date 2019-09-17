package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceClientController {

	@Autowired
	UserServiceClient userServiceClient;
	@Autowired
	ImageServiceClient imageServiceClient;
	
	@GetMapping("/fetchusers")
	public ResponseEntity<?> getUsers(){
		return ResponseEntity.ok(userServiceClient.getUsers()) ;
	}
	
	@GetMapping("/fetchusers/{id}")
	public ResponseEntity<?> findUser(@PathVariable("id") String userID){
		return userServiceClient.findUser(userID) ;
}
	
	@GetMapping("/images")
	public ResponseEntity<?>  getImages(){
		return ResponseEntity.ok(imageServiceClient.getImages()) ;
	}
}