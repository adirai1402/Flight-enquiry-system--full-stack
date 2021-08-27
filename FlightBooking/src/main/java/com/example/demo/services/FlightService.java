package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Flight;

@Service
public class FlightService {
	
	@Autowired
	private RestTemplate template;
	
	String URL = "http://Flight-Information/api/listflights";
	String URL_1 = "http://pricing-system/getprice";
	
	public List<Flight> getFlights(){
		System.out.println("this is get request from api listflights");
		System.out.println(this.template.exchange(URL, HttpMethod.GET, null, 
				new ParameterizedTypeReference<List<Flight>>() {}).getBody());
		return this.template.exchange(URL, HttpMethod.GET, null, 
				new ParameterizedTypeReference<List<Flight>>() {}).getBody();
	}
	public Flight search(Flight entity) {
//		// not using exchange here rather using postforObject to do the same task
		System.out.println("I am running from post for object in booking");
		System.out.println("I am entity in search post for object" + entity);
		return this.template.postForObject(URL, entity, Flight.class);
	}
	
	public Double getPrice(){
		return this.template.getForObject(URL_1, Double.class);
	}
	
	public Double postPrice(Double entity) {
		// not using exchange here rather using postforObject to do the same task
		return this.template.postForObject(URL_1, entity, Double.class);
	}
	
}
