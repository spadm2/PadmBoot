package com.airindia.reserve.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airindia.reserve.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{

}
