package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Flight;
import com.example.demo.services.FlightService;

@Controller
public class FlightController {
		
	@Autowired
	private Flight flight;
	@Autowired
	private FlightService service;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("title", "Welcome to xxx");
		return "index";
	}
	
	@RequestMapping(value="/flights", method=RequestMethod.GET)
	public String initForm(Model model) {
		System.out.println(flight);
		model.addAttribute("flightSearch", flight);
		return "searchFlight";
	}
	@RequestMapping(value="/flights", method=RequestMethod.POST)
	public String submitForm(Flight flight, Model model) {
		System.out.println("I am runnign from submitFOmr post request");
		Flight fl = this.service.search(flight);
		List<Flight> flee = this.service.getFlights();
		List<Double> prices = new ArrayList<>();
		for (Flight eachFlight : flee) {
			Double temp = this.service.postPrice(eachFlight.getDistanceInKm());
			Double temp1 = this.service.getPrice();
			System.out.println("printing in request mapping of post method flights" + temp1);
			prices.add(temp1);
		}
		model.addAttribute("flightlist", flee);
		model.addAttribute("pricelist", prices);
		return "showFlights";
	}
//	@RequestMapping(value="/students/all", method=RequestMethod.GET)
//	public String getAllStudents(Model model) {
//		List<Student> list = this.service.findAll();
//		model.addAttribute("list", list);
//		return "showStudent";
//	}
}

