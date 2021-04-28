package com.bae.starterproject.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bae.starterproject.service.PrizeGenService;

@RestController
public class PrizeGenController {

	private PrizeGenService service;

	public PrizeGenController(PrizeGenService service) {
		super();
		this.service = service;
	}

	@GetMapping("/genPrize/{accNumber}")
	public String genPrize(@PathVariable String accNumber) {
		return String.valueOf(this.service.genPrize(accNumber));
	}

}
