package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Flight;
import com.example.demo.repo.FlightRepo;

@Service
public class FlightInfoService {
	
	private Flight fl;
	
	@Autowired
	private FlightRepo repo;
	
	public List<Flight> listAll(){

		String source = fl.getFromCity();
		String dest = fl.getToCity();
		System.out.println("Printing source adn query here" + source + "----" + dest);
		return this.repo.listFlights(source, dest);
	}
	
	public void search(Flight fl) {
		this.fl=fl;
	}
	
	public Flight getById(int id) {
		return this.repo.getById(id);
	}
	
	
	
}
