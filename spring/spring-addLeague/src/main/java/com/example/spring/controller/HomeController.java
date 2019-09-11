package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring.model.League;
import com.example.spring.repository.LeagueRepository;

@Controller
@RequestMapping("/league")
public class HomeController {

	private LeagueRepository leagueRepository;

	public HomeController(LeagueRepository leagueRepository) {
		super();
		this.leagueRepository = leagueRepository;
	}
	
	@GetMapping("/list")
	public String showList(Model theModel) {
		theModel.addAttribute("list",leagueRepository.findAll());
		
		return "index";
		
	}
	
	@GetMapping("/addForm")
	public String showAddForm(Model theModel) {
		theModel.addAttribute("league",new League());
		String[] season = {"summer","winter","spring","rainy" ,"ihh"};
		theModel.addAttribute("season",season);
		
		return "add-form";
		
	}
	
	@PostMapping("/add")
	public String addLeague(@ModelAttribute("league") League league) {
		leagueRepository.save(league);
		
		return "redirect:/league/list";
		
	}
}
