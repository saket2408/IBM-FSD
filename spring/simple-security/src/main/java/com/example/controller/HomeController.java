package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String goHome() {
		return "home";
	}
	
	@GetMapping("/showMyLoginPage")
	public String showLogin() {
		return "login-form";
	}
}
