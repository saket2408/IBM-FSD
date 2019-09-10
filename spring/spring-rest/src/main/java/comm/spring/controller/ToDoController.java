package comm.spring.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comm.spring.domain.ToDo;

@RestController
@RequestMapping("/api")
public class ToDoController {
	private List<ToDo> list = null;

	@PostConstruct
	public void setList() {
		list = new ArrayList<ToDo>();
	}

	@GetMapping("/todos")
	public List<ToDo> getToDos() {
		list.add(new ToDo("practice Spring", new Date()));
		list.add(new ToDo("practice java", new Date()));
		return list;
	}

}
