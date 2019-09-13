package com.example;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	 @RequestMapping("/")
	    public String handler(ModelMap model, HttpServletRequest request) {
	        Authentication auth = SecurityContextHolder.getContext()
	                                                   .getAuthentication();
	        model.addAttribute("uri", request.getRequestURI());
	        model.addAttribute("user", auth.getName());
	        model.addAttribute("roles", auth.getAuthorities());
	        return "app";
	    }

}
