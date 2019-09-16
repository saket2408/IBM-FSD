package com.example.demo.service;

import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	
@Autowired
	public UserService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
		super();
		this.userRepository = userRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	public UserDto createUser(UserDto userDetail) {
		ModelMapper mapper = new ModelMapper();
		User user = mapper.map(userDetail, User.class);
		String password = bCryptPasswordEncoder.encode(user.getPassword());
		user.setPassword(password);
		user.setUserId(UUID.randomUUID().toString());
		userRepository.save(user);
		UserDto userdto = mapper.map(user, UserDto.class);
		return userdto;
	}

	public List<User> getAllUsers() {
		List<User> users = (List<User>) userRepository.findAll();
		return users;

	}
	
	public User findUser(String userId) {
		User user = userRepository.findByUserId(userId);
		return user;
	}
	
	public User deleteUser(String userId) {
		User user = userRepository.findByUserId(userId);
		userRepository.delete(user);
		return user;
	}
	
	public UserDto updateUser(UserDto userDetail, String userId) {
		ModelMapper mapper = new ModelMapper();
		User user = userRepository.findByUserId(userId);
		String password = bCryptPasswordEncoder.encode(userDetail.getPassword());
		user.setPassword(password);
		user.setFirstName(userDetail.getFirstName());
		user.setLastName(userDetail.getLastName());
		user.setEmail(userDetail.getEmail());
		userRepository.save(user);
		UserDto userdto = mapper.map(user, UserDto.class);
		return userdto;
	}
}
