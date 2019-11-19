package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/users")
	public ResponseEntity<?> getAll(){
		if(userRepository.findAll()!=null)
			return ResponseEntity.status(HttpStatus.CREATED).body(userRepository.findAll());
		else
			return ResponseEntity.ok("no users present");
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<?> getAll(@PathVariable(name = "id") Integer id){
		if(userRepository.findById(id)!=null)
			return ResponseEntity.status(HttpStatus.CREATED).body(userRepository.findById(id));
		else
			return ResponseEntity.ok("no user found");
	}

	@PostMapping("/users")
	public ResponseEntity<?> addUser(@RequestBody User user){
		userRepository.save(user);
		return ResponseEntity.ok(userRepository.findAll());
	}
	
	@DeleteMapping("/users")
	public ResponseEntity<?> deleteUser(@RequestBody User user){
		userRepository.delete(user);
		return ResponseEntity.ok(userRepository.findAll());
	}
	
	
	
}
