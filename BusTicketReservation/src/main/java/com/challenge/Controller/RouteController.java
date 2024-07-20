package com.challenge.Controller;


import java.util.List;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.exceptions.RouteException;
import com.challenge.model.Route;
import com.challenge.service.RouteService;


@RestController
@RequestMapping("/route/")
public class RouteController {
	
	@Autowired
	private RouteService  rService;
	
	@GetMapping("/viewAll")
    public ResponseEntity<List <Route>> getAllRoutes()throws RouteException {
		
        return new ResponseEntity<List <Route>>(rService.viewAllRoute(),HttpStatus.OK);
    }
	
	@PostMapping("/save/{key}")
    public ResponseEntity<Route> createRoute(@Validated @RequestBody Route route,@PathVariable("key") String key)throws RouteException, LoginException, com.challenge.exceptions.LoginException {
		
		Route rou = rService.addRoute(route,key);
		
        return new ResponseEntity<Route>(rou,HttpStatus.OK);
    } 
	
	@GetMapping("/find/{routeId}")
    public ResponseEntity<Route> getRouteById(@PathVariable int routeId)throws RouteException{
		
		Route route = rService.viewRoute(routeId);
		
		return new ResponseEntity<Route>(route,HttpStatus.OK); 
    }
		
	
	@PutMapping("/update/{key}")
    public ResponseEntity<Route> updateRouteById(@Validated @RequestBody Route route,@PathVariable("key") String key)throws RouteException, LoginException, com.challenge.exceptions.LoginException {
		
		
			return new ResponseEntity<Route>(rService.updateRoute(route,key),HttpStatus.OK);
		
    }
	
	@DeleteMapping("/delet/{routeId}/{key}")
    public ResponseEntity<Route> deleteRouteById(@PathVariable int routeId,@PathVariable("key") String key)throws RouteException, LoginException, com.challenge.exceptions.LoginException {
		
		
			return new ResponseEntity<Route>(rService.deleteRoute(routeId,key),HttpStatus.OK);
		
	}


}
