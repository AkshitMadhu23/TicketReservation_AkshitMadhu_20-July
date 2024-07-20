package com.challenge.service;

import javax.security.auth.login.LoginException;
import com.challenge.exceptions.*;

import com.challenge.dto.LoginDTO;

public interface LoginService {
	
    public String logInIntoAccount(LoginDTO dto)throws LoginException;
	
	public String LogOutFromAccount(String key)throws LoginException;

}
