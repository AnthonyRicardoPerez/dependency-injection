package com.anthony.springboot.di.app.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;

import com.anthony.springboot.di.app.models.service.IService;


@Controller
public class IndexController {
	
	@Autowired
//	@Qualifier("service2")
	private IService service;

	@GetMapping({"/", "", "/index"})
	public String index(Model model) {
		model.addAttribute("objeto", service.operacion());
		return "index";
	}
	
	
}
