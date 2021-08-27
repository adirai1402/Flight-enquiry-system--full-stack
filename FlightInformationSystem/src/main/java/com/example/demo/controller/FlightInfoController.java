package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Flight;
import com.example.demo.service.FlightInfoService;

@RestController
public class FlightInfoController {
	
	@Autowired
	private FlightInfoService service;
	
//	@GetMapping(path= "/listFlights/{source}/{dest}")
//	public List<Flight> listAll(@PathVariable String source,@PathVariable String dest){
//		return this.service.listAll(source,dest);	
//	}
//	@GetMapping(path="/api/v1/maaka")
//	public String giveme() {
//		return "bakayaru";
//	}
	
	@GetMapping(path="/api/listflights")
	public List<Flight> giveFlights(){
		return this.service.listAll();
	}
	@PostMapping(path="/api/listflights")
	public void search(@RequestBody Flight fl){
		System.out.println("I am from post mapping in flightInfoController" + fl);
		this.service.search(fl);
	}
	
	@GetMapping(path= "/getById/{id}")
	public Flight getById(@PathVariable int id){
		return this.service.getById(id);	
	}

}
