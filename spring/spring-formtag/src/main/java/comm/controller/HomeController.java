package comm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
@GetMapping("/")
	public String goHome() {
		return "index";
	}
@GetMapping("/homeForm")
public String goHomeForm() {
	return "home-form";
}
@PostMapping("/showHome")
public String showForm(@RequestParam("name") String name) {
	return "show-home";
}

}
