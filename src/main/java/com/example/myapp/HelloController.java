package com.example.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@ResponseBody
	@GetMapping("/")
	public String index() {
		return "welcome home";
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(required=false) String name, Model model) {
		model.addAttribute("greetings", "Hello~~"+name);
		return "hello";
	}
}
