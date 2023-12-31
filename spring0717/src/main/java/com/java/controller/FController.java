package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FController {
	
	@RequestMapping("/index")
	public String index(@RequestParam(defaultValue = "none") String resultCode,
			Model model) {
		model.addAttribute("resultCode", resultCode);
		return "index";
	}

}
