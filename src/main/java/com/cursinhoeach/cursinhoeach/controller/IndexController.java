package com.cursinhoeach.cursinhoeach.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/hello")
	public String sayhello(@RequestParam("name") String name, Model model) {
		model.addAttribute("name",name);
		return "hello";
	}
}