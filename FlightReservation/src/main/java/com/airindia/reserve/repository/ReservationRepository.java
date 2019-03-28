package com.airindia.reserve.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airindia.reserve.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
