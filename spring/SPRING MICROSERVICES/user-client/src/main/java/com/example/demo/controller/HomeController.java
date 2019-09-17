package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.client.UserServiceClient;
import com.example.demo.model.UserRequestModel;
import com.example.demo.model.UserResponseModel;

@Controller
public class HomeController {
	@Autowired
	UserServiceClient userServiceClient;

	@GetMapping("/")
	public String goHome() {
		return "index";
	}
	
	@GetMapping("/addUser")
	public String goAddForm(Model model) {
		model.addAttribute("user" , new UserRequestModel());
		return "add-form";
	}
	
	@GetMapping("/viewUsers")
	public String viewAll(Model model) {
		model.addAttribute("list",userServiceClient.getUsers());
		return "home";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") String userId) {
		userServiceClient.deleteUser(userId);
		System.out.println(userId);
		return "redirect:/viewUsers";
	}
	
	@PostMapping("/search")
	public String abc(@RequestParam("id") String userId, Model model) {
		if(userId.length()==0) {
			model.addAttribute("list",userServiceClient.getUsers());
			return "home";
		}
		else {
		model.addAttribute("element" , userServiceClient.findUser(userId));
		return "home";
		}
	}
	
	@PostMapping("/add")
	public String add(@ModelAttribute("user") UserRequestModel userDetail) {
		userServiceClient.createUser(userDetail);
		return "redirect:/viewUsers";
	}
	
}
