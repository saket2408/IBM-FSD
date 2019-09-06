package comm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import comm.model.Student;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String goHome()
	{
		return "main-menu";
	}
	@RequestMapping(method = RequestMethod.GET, name="/studentForm")
	public String goStudent()
	{
		return "student-form";
	}
	
	@RequestMapping(method = RequestMethod.POST, name="/processForm")
	public String processStudent(@RequestParam("name") String name,@RequestParam("email") String email,
			@RequestParam("phone") String phone, Model theModel)
	{
		Student student = new Student(name,email,phone);
		theModel.addAttribute("student", student);
		return "process-form";
	}
}

