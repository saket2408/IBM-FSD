package comm.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import comm.bean.Employee;
import comm.bean.empService_02;

@Controller
public class HomeController {
	@GetMapping("/")
	public String goHome(Model model) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		empService_02 service = context.getBean("empService02", empService_02.class);
		Employee e = context.getBean("employee", Employee.class);
		model.addAttribute("employee", e);
		List<Employee> list = new ArrayList<Employee>();
		try {
			list = service.getEmployee();
			model.addAttribute("list", list);
		} catch (SQLException a) {
			a.printStackTrace();
		}
		return "index";
	}

	@PostMapping("/add")
	public String goStudentForm(@ModelAttribute("employee") Employee employee,Model model) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e = context.getBean("employee", Employee.class);
		empService_02 service = context.getBean("empService02", empService_02.class);
		service.createEmployee(employee);
		return goHome(model);
	}
	
	@PostMapping("/search")
	public String goSearch(@RequestParam("pattern") String pattern,Model model) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		empService_02 service = context.getBean("empService02", empService_02.class);
		List<Employee> list = new ArrayList<Employee>();
		try {
			list = service.searchEmployee(pattern);
			model.addAttribute("list" , list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "search-result";
	}

}
