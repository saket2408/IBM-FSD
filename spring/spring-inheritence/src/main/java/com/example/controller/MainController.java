package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.repository.ContractEmployeeRepository;
import com.example.repository.EmployeeRepository;
import com.example.repository.PermanentEmployeeRepository;

@Controller
public class MainController {
	
	private ContractEmployeeRepository contractEmployeeRepository;
	private EmployeeRepository employeeRepository;
	private PermanentEmployeeRepository permanentEmployeeRepository;
		
		public MainController(ContractEmployeeRepository contractEmployeeRepository, EmployeeRepository employeeRepository,
			PermanentEmployeeRepository permanentEmployeeRepository) {
		super();
		this.contractEmployeeRepository = contractEmployeeRepository;
		this.employeeRepository = employeeRepository;
		this.permanentEmployeeRepository = permanentEmployeeRepository;
	}
		
	@GetMapping("/")
	public String goHome() {
		return "index";
		
	}
	
	@PostMapping("/criteria")
	public String goList(@RequestParam("criteria") String criteria, Model model) {
		if(criteria.equals("employee")) {
			model.addAttribute("employee" , employeeRepository.findAll());
		}
		else if(criteria.equals("permanent_employee")) {
			model.addAttribute("permanent_employee" , permanentEmployeeRepository.findAll());
		}
		else {
			model.addAttribute("contract_employee" , contractEmployeeRepository.findAll());
		}
		return "index";
		
	}
	

}
