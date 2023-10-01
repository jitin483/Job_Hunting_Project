package com.mvc.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mvc.models.Hr;




/**
 * @author JitinKumar,AbhishekChaudhry,DakshKausik,ShubhamSharma
 * 
 * This is interface which extens JpaRepository
 */
public interface HrRepository extends JpaRepository<Hr, Integer> {
	
	/**
	 * 
	 * find hr object using by name
	 */
	public Hr findByUsername(String username);
	
	public Hr findByUsernameAndPassword(String username,String password);
	
	/**
	 * 
	 * This is for hrManager count
	 */
   @Query("SELECT COUNT(hr) FROM Hr hr")
   public Long countHr();
   
 
   
   
   
   
   long countByName(String name);


}