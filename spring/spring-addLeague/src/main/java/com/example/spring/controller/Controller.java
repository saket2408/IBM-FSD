package com.example.spring.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.spring.repository.LeagueRepository;

@org.springframework.stereotype.Controller
public class Controller {
	private LeagueRepository leagueRepository;

	public Controller(LeagueRepository leagueRepository) {
		super();
		this.leagueRepository = leagueRepository;
	}

	@GetMapping("/")
	public String init() {
		return "redirect:/list";
	}

	@GetMapping("/list")
	public String showList(Model theModel) {
		theModel.addAttribute("list", leagueRepository.findAllByOrderByTitleAsc());

		return "index";

	}

	@PostMapping("/searchLeague")
	public String searchLeague(@RequestParam("search") String search, Model theModel) {
		if (search.length() == 0) {
			theModel.addAttribute("list", leagueRepository.findAllByOrderByTitleAsc());
			return "index";
		} else {
			theModel.addAttribute("list",
					leagueRepository.findAllByTitleContainingIgnoreCaseOrSeasonContainingIgnoreCase(search, search));
			return "index";
		}

	}
}
