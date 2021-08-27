package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Entity
@Component
@Table(name="Flights")
public class Flight {
	
	@Id
	@Column(name ="flightId")
	int flightId;
	
	@Column(name ="fromCity")
	String fromCity;
	
	@Column(name ="toCity")
	String toCity;
	
	@Column(name ="startTime")
	String startTime;
	
	@Column(name ="endTime")
	String endTime;
	
	@Column(name ="distanceInKm")
	double distanceInKm;

}
