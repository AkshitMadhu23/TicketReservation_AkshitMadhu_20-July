package com.challenge.service;

import java.util.List;

import com.challenge.dto.ReservationDTO;
import com.challenge.exceptions.LoginException;
import com.challenge.exceptions.ReservationException;
import com.challenge.model.Reservations;


public interface ReservationService {
	
	public Reservations addReservation(ReservationDTO reservationDTO,String key ) throws ReservationException,LoginException, javax.security.auth.login.LoginException;

	public Reservations updateReservation(Reservations reservation,String key) throws ReservationException,LoginException, javax.security.auth.login.LoginException;
	
	public Reservations deleteReservation(Integer reservationId,String key) throws ReservationException,LoginException, javax.security.auth.login.LoginException;
	
	public Reservations viewAllReservation(Integer reservationId,String key)throws LoginException, javax.security.auth.login.LoginException;
	
	public List<Reservations> getReservationDeatials(String key) throws ReservationException,LoginException, javax.security.auth.login.LoginException;
	
//	public List<Reservations> getAllReservation(LocalDate date) throws ReservationException;
	
	

}
