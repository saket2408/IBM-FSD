package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.client.UserServiceClient;

@Controller
public class HomeController {
	@Autowired
	UserServiceClient userServiceClient;

	@GetMapping("/")
	public String goHome() {
		return "index";
	}
	
	@GetMapping("/viewUsers")
	public String viewAll(Model model) {
		model.addAttribute("list",userServiceClient.getUsers());
		return "home";
	}
}
