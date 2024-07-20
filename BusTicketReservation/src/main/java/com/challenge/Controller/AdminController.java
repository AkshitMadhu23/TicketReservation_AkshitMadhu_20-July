package com.challenge.Controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.exceptions.AdminException;
import com.challenge.model.Admin;
import com.challenge.service.AdminServiceImpl;
@RestController
public class AdminController {
	
	@Autowired
	private AdminServiceImpl asi;
	
	
	
	@PostMapping("/admin")
	public ResponseEntity<Admin> registerAdmin(@Valid @RequestBody Admin admin) throws AdminException
	{
		 Admin adm = asi.addAdmin(admin);
		 
		 return new ResponseEntity<Admin>(adm,HttpStatus.OK);
		
	}

}
