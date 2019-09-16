package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.model.UserRequestModel;
import com.example.demo.model.UserResponseModel;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/users")
	public ResponseEntity<UserResponseModel> createUser(@RequestBody UserRequestModel userDetail){
		ModelMapper mapper = new ModelMapper();
		UserDto dto = mapper.map(userDetail, UserDto.class);
		UserDto dto1 = service.createUser(dto);
		UserResponseModel user = mapper.map(dto1, UserResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	
	}
	
	@GetMapping("/users")
	public List<ResponseEntity<UserResponseModel>> getUsers(){
		List<User> users = service.getAllUsers();
		List<ResponseEntity<UserResponseModel>> list = new ArrayList<ResponseEntity<UserResponseModel>>();
		ModelMapper mapper = new ModelMapper();
		for(User u : users) {
			UserResponseModel res = mapper.map(u, UserResponseModel.class);
			list.add(ResponseEntity.status(HttpStatus.CREATED).body(res));
		}
		return list;
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<UserResponseModel> findUser(@PathVariable("id") String userID){
		ModelMapper mapper = new ModelMapper();
		User user = service.findUser(userID);
		UserResponseModel model = mapper.map(user, UserResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(model);
		
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<UserResponseModel> deleteUser(@PathVariable("id") String userID){
		ModelMapper mapper = new ModelMapper();
		User user = service.deleteUser(userID);
		UserResponseModel model = mapper.map(user, UserResponseModel.class);
		return ResponseEntity.status(HttpStatus.GONE).body(model);	
	} 
	
	@PutMapping("/users/{id}")
	public ResponseEntity<UserResponseModel> updateUser(@RequestBody UserRequestModel userDetail,@PathVariable("id") String userID){
		ModelMapper mapper = new ModelMapper();
		UserDto dto = mapper.map(userDetail, UserDto.class);
		UserDto dto1 = service.updateUser(dto, userID);
		UserResponseModel user = mapper.map(dto1, UserResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	
	}
}
