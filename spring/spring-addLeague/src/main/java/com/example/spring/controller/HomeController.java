package com.example.spring.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		theModel.addAttribute("list",leagueRepository.findAllByOrderByTitleAsc());
		
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
	
	@PostMapping("/deleteLeague")
	public String deleteLeague(@RequestParam("id") int id) {
		leagueRepository.deleteById(id);
		
		return "redirect:/league/list";
		
	}
	@PostMapping("/updateLeague")
	public String updateLeague(@RequestParam("id") int id, Model theModel) {
		Optional<League> result = leagueRepository.findById(id);
		League league = result.get();
		theModel.addAttribute("league" , league);
		String[] season = {"summer","winter","spring","rainy" ,"ihh"};
		theModel.addAttribute("season",season);
		leagueRepository.deleteById(id);
		
		return "add-form";
		
	}
	
	@PostMapping("/searchLeague")
	public String searchLeague(@RequestParam("search") String search, Model theModel) {
		if(search.length()==0) {
			theModel.addAttribute("list",leagueRepository.findAllByOrderByTitleAsc());
			return "index";
		}
		else {
		theModel.addAttribute("list",leagueRepository.findAllByTitleContainingIgnoreCaseOrSeasonContainingIgnoreCase(search, search));
		return "index";
		}
	}
}
