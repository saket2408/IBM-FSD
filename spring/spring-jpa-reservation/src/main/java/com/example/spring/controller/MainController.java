package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring.repository.ReservationRepository;

@Controller
@RequestMapping("/api")
public class MainController {
	ReservationRepository reservationRepository;

	
	
	public MainController() {
		super();
	}



	public String goHome(Model theModel) {
		theModel.addAttribute("reservation" , reservationRepository.findAll());
		return "home";
	}

}
