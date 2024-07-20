package com.challenge.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.dto.AdminDTO;
import com.challenge.exceptions.LoginException;
import com.challenge.model.Admin;
import com.challenge.model.CurrentUserSession;
import com.challenge.repository.AdminRepo;
import com.challenge.repository.SessionRepo;

import net.bytebuddy.utility.RandomString;


@Service
public class LoginAdminServiceImpl implements LoginAdminService {
	
	@Autowired
	private SessionRepo sr;
	
	@Autowired
	private AdminRepo ar;

	@Override
	public String loginAdmin(AdminDTO dto) throws LoginException {

		Admin exAdmin = ar.findByAdminUserName(dto.getUsername());
		
		if(exAdmin == null)
		{
			throw new LoginException("Please Enter valid Username.. ");
		}
		
		Optional<CurrentUserSession> vcso = sr.findById(exAdmin.getAdminId());
		
		if(vcso.isPresent())
		{
			throw new LoginException("Adimin already logged in..");
		}
		
		if(exAdmin.getAdminPassword().equals(dto.getPassword()))
		{
            String key = RandomString.make(6);
			
			CurrentUserSession cus = new CurrentUserSession(exAdmin.getAdminId(), key, LocalDateTime.now());
			
			sr.save(cus);
			
			return cus.toString();
		}
		else
		{
			throw new LoginException("Please Enter a valid password");
		}
		
		
		
	}

	@Override
	public String logoutAdmin(String key) throws LoginException {
        CurrentUserSession validCustomerSession = sr.findByUuid(key);
		
		
		if(validCustomerSession == null) {
			throw new LoginException("User Not Logged In with this number");
			
		}
		
		
		sr.delete(validCustomerSession);
		
		
		return "Logged Out !";
	}


}
