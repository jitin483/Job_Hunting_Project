package com.mvc.dao;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mvc.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	//find user using username
	public User findByUsername(String username);
	
	//for login verification
	public User findByUsernameAndPassword(String username,String password);
	
	
	
	
	//for count users how many users in database
	@Query("select count(users) from User users")
	public Long countUsers();
	
	
	
}
