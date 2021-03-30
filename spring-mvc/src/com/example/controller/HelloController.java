package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(path="/hello")
	public String helloPage() {
		System.out.println("===== Inside HelloController.helloPage() =====");
		return "hello";
	}
	
	@RequestMapping(path="/greet")
	public ModelAndView greetPage() {
		System.out.println("===== Inside HelloController.greetPage() =====");
		ModelAndView modelAndView = new ModelAndView("hello","GREET","Good Morning to All");
		return modelAndView;
	}
	
}
