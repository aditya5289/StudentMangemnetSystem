package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomController {
	
	@Autowired
//	private StudentService studentService;

	
	@GetMapping("/")
	public String displayLink() {
		return "/index";
	}
	

}
