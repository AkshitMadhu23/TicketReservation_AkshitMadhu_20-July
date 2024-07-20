package com.challenge.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.model.Reservations;

@Repository
public interface ReservationRepo extends JpaRepository<Reservations, Integer> {
	
	public List<Reservations> findByReservationDate(LocalDate date);


}
