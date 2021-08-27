package com.example.demo.entity;


import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Flight {
	
	int flightId;
	String fromCity;
	String toCity;
	String startTime;
	String endTime;
	double distanceInKm;
}
