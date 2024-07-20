package com.challenge.service;

import javax.security.auth.login.LoginException;
import com.challenge.exceptions.*;

import com.challenge.dto.AdminDTO;

public interface LoginAdminService {
	
	public String loginAdmin(AdminDTO dto)throws LoginException, com.challenge.exceptions.LoginException;
	
	public String logoutAdmin(String key) throws LoginException, com.challenge.exceptions.LoginException;

}


