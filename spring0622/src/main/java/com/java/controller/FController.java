package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.service.BService;

@Controller
public class FController {
	
	@Autowired
	BService bService;
	
	@GetMapping("/index")
	public String index() {
		System.out.println("s(20) : "+bService.add());
		return "index";
	}
	
}
