package com.challenge.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.exceptions.AdminException;
import com.challenge.model.Admin;
import com.challenge.repository.AdminRepo;


@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepo ar;

	@Override
	public Admin addAdmin(Admin admin)throws AdminException {
		
		 Admin adm = ar.findByAdminUserNameAndAdminPassword(admin.getAdminUserName(),admin.getAdminPassword());
		 
		 if(adm!=null)
		 {
			 throw  new AdminException("Admin Already Exists..");
		 }
		 else
		 {
			 return ar.save(admin);
		 }
//		return ar.save(admin);
		
	}

}
