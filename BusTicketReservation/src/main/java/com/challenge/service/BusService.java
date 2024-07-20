package com.challenge.service;

import java.util.List;

import javax.security.auth.login.LoginException;

import com.challenge.exceptions.BusException;
import com.challenge.model.Bus;

public interface BusService {

	//public Bus addBus(Bus bus,String key)throws BusException,LoginException;
	public Bus updateBus(Bus bus,String key)throws BusException,LoginException;
	public Bus deleteBus(int busId,String key)throws BusException,LoginException;
	public Bus viewBus(int busId)throws BusException;
	public List<Bus> viewBusByType(String BusType) throws BusException;
	public List<Bus> viewAllBuses() throws BusException;
}
