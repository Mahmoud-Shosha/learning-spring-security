package com.company.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoAppController {

	@GetMapping("/")
	public String showHome() {
		return "home";
	}
}
