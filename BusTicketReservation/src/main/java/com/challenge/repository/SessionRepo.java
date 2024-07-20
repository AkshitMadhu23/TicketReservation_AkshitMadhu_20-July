package com.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.model.CurrentUserSession;

public interface SessionRepo extends JpaRepository<CurrentUserSession, Integer> {

	
	public CurrentUserSession findByUuid(String Uuid);
}