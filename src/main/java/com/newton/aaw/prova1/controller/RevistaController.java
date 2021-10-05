package com.newton.aaw.prova1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prova")
public class RevistaController {
	
	@GetMapping
	public String prova() {
		return "Prova Av1";
	}

}
