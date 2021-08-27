package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Flight;
import com.example.demo.services.PricingService;

@RestController
public class PricingController {

	@Autowired
	private PricingService service;
	
	@GetMapping(path="/getprice")
	public Double getPricing() {
		return this.service.getPricing();
	}
	@PostMapping(path="/getprice")
	public void setPricing(@RequestBody Double distance) {
		this.service.setDistance(distance);
	}
}
