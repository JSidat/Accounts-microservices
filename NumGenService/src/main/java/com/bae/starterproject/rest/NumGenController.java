package com.bae.starterproject.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.starterproject.service.NumGenService;

@RestController
public class NumGenController {

	private NumGenService service;

	public NumGenController(NumGenService service) {
		super();
		this.service = service;
	}

	@GetMapping("/genNum")
	public String generateNumber() {
		return this.service.genNumber();
	}

}
