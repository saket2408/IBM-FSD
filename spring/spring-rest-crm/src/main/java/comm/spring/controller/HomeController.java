package comm.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import comm.spring.entity.Customer;
import comm.spring.service.CustomerService;

@RestController
@RequestMapping("/api")
public class HomeController {
	@Autowired
	private CustomerService service;
	
	@GetMapping("/customers")
	public List<Customer> getCustomer() {
		return service.viewCustomers();
		 
	}
	
	@PostMapping("/customers")
	public List<Customer> postCustomer(@RequestBody Customer customer) {
		customer.setId(0);
		service.createCustomer(customer);
		return service.viewCustomers();
	}
	@GetMapping("/customers/{id}")
	public Customer getById(@PathVariable("id") int id) {
		return service.getCustomer(id);
	
	}
	@DeleteMapping("/customers/{id}")
	public List<Customer> deleteCustomer(@PathVariable("id") int id) {
		service.deleteCustomer(id);
		return service.viewCustomers();
	}
	
	@PutMapping("/customers")
	public List<Customer> updateCustomer(@RequestBody Customer customer) {
		service.update(customer);
		return service.viewCustomers();
	}
	
}
