package com.challenge.repository;


//import org.apache.catalina.realm.JNDIRealm.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.challenge.model.*;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
	public User findByContact(Long contact);
	

}
