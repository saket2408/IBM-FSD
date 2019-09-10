package com.example.firstspringboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {
	
	@Autowired
	private StudentImpl student;

	@GetMapping("/students")
	public List<Student> getStudent() {
		return student.getAll();
	}
	
	@PostMapping("/students")
	public List<Student> postStudent(@RequestBody Student student1) {
		student1.setId(0);
		student.addStudent(student1);
		return student.getAll();
	}
	
	@GetMapping("/students/{id}")
	public Student findStudent(@PathVariable("id") int id) {
		
		return student.findStudent(id);
	}
}
