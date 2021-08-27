package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


@Service
public class PricingService {

	private Double distance;
	
	public double getPricing() {
		
		if(distance<50) {
			return distance*50;
		}
		else if(distance<100) {
			return distance*45;
		}
		else {
			return distance*40;
		}
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}

}
