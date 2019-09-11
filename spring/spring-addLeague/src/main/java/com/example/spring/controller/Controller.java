package com.example.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/")
	public String init() {
		return "redirect:/league/list";
	}

}
