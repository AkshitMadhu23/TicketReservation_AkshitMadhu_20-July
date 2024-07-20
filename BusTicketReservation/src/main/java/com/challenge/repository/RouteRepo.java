package com.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.model.Route;

@Repository
public interface RouteRepo extends JpaRepository<Route, Integer> {

	public Route findByRouteFromAndRouteTo(String from,String to);

}
