package com.challenge.service;


import com.challenge.exceptions.AdminException;
import com.challenge.model.Admin;

public interface AdminService {
	
	public Admin addAdmin(Admin admin)throws AdminException;
}
