package com.challenge.Controller;

import javax.security.auth.login.LoginException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.challenge.dto.AdminDTO;
import com.challenge.service.LoginAdminService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class LoginAdminController {
	
	@Autowired
	private LoginAdminService lasi;
	
	
	@PostMapping("/loginadmin")
	public ResponseEntity<String> loginUser(@Valid @RequestBody AdminDTO dto) throws LoginException, com.challenge.exceptions.LoginException
	{
		String str = lasi.loginAdmin(dto);
		
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	
	@PostMapping("/logoutadmin/{key}")
	public ResponseEntity<String> logoutUser(@PathVariable("key") String key) throws LoginException, com.challenge.exceptions.LoginException
	{
		String mssg = lasi.logoutAdmin(key);
		
		return new ResponseEntity<String>(mssg,HttpStatus.OK);
	}
	

}
