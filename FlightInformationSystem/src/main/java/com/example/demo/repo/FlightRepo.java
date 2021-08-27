package com.example.demo.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Flight;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Integer> {
	
	//one custom queries needed: Find by source and destination-return type is list of flights
	@Query(value="SELECT * FROM Flights WHERE fromCity = :source AND toCity = :dest", nativeQuery=true)
	public List<Flight> listFlights(@Param("source") String source,@Param("dest") String dest);
}
