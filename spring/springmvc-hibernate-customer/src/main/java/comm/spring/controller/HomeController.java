package comm.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import comm.spring.entity.Customer;
import comm.spring.service.CustomerService;

@Controller
public class HomeController {
	@Autowired
	private CustomerService service;
	private List<Customer> list = new ArrayList<Customer>();
	
	@GetMapping("/")
	public String goHome( Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer" , customer);
		list = service.viewCustomers();
		model.addAttribute("list" , list);
		return "index";
	}
	@GetMapping("/addForm")
	public String goForm(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer" , customer);
		System.out.println(customer.getFirstName());
		return "addForm";
	}
	@PostMapping("/save")
	public String save(@ModelAttribute(name = "customer") Customer customer) {
		service.createCustomer(customer);
		return "redirect:/";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("id") String param) {
		int id = Integer.parseInt(param);
		service.deleteCustomer(id);
		return "redirect:/";
	}
	@GetMapping("/update")
	public String update(@RequestParam("id") String param, Model model) {
		int id = Integer.parseInt(param);
		Customer c = service.getCustomer(id);
		model.addAttribute("customer" , c);
		return "updateForm";
	}
	
	@PostMapping("/updatecustomer")
	public String updateCustomer(@RequestParam("id") String param , @ModelAttribute("customer") Customer customer) {
		int id = Integer.parseInt(param);
		service.update(id, customer);
		return "redirect:/";
	}
	@PostMapping("/search")
	public String searchCustomer(@RequestParam("key") String param, Model model) {
		list = service.search(param);
		model.addAttribute("list" , list);
		return "search-result";
		
	}
}
