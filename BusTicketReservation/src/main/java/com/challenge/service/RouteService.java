package com.challenge.service;

import java.util.List;

import javax.security.auth.login.LoginException;

import com.challenge.exceptions.RouteException;
import com.challenge.model.Route;

public interface RouteService {
	   public Route addRoute(Route route,String key)throws RouteException,LoginException, com.challenge.exceptions.LoginException;
	   public Route updateRoute(Route route,String key)throws RouteException,LoginException, com.challenge.exceptions.LoginException; 
	   public Route deleteRoute(int routeId,String key)throws RouteException,LoginException, com.challenge.exceptions.LoginException;
	   public Route viewRoute(int routeId)throws RouteException;
	   List<Route> viewAllRoute()throws RouteException;

}
