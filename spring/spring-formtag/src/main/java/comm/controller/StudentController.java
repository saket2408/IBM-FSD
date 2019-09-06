package comm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import comm.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
@GetMapping("/")
	public String goStudentForm(Model model) {
	Student student = new Student();
	model.addAttribute("student",student);
		return "student-form";
	}

@PostMapping("/processForm")
public String goProcessForm(@ModelAttribute("student") Student student) {
	return "process-studentform";
}
}
