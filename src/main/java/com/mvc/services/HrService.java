package com.mvc.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mvc.dao.HrRepository;
import com.mvc.exception.DuplicateManagerFoundException;
import com.mvc.exception.ManagerNotFoundException;
import com.mvc.models.Hr;

/**
 * @author JitinKumar,AbhishekChaudhry,DakshKausik,ShubhamSharma
 * 
 * */
@Service
public class HrService {
	
	//Autowired HRRepository interface 

	@Autowired
	 private HrRepository repo;
	
	
	/**
	 * This is for create New HrManager in database
	 * @exception  DuplicateManagerFoundException it is in exception package
	 * */
	public boolean createNewHr(Hr hr)
	{
		Hr h=repo.save(hr);
		if(h==hr) {
			return true;
		}
		else if(h.getUsername()==hr.getUsername()) {
			throw new DuplicateManagerFoundException("User already exists");
			
		}else
			throw new DuplicateManagerFoundException("Something went wrong");
		
	}

	
	
	/**
	 * This is for get HrManager object from database using username
	 * @exception  ManagerNotFoundException it is in exception package
	 * */
	public Hr getHr(String username)
	{
        Hr hr =repo.findByUsername(username);
  
	     if(hr!=null)
	        {
		 return hr;
	               }
	 else
	 {
		 throw new ManagerNotFoundException("User not Found");
		
	 }
	}
	
	
	/**
	 * This is for delete HrManager in database
	 * @exception  DuplicateManagerFoundException it is in exception package
	 * */
	public  void deleteHr(int id)
	{
		Optional<Hr> userdel =	 repo.findById(id);
		 
		 if(userdel.isPresent())
		 {
			repo.delete(userdel.get()); 
		 }
		 else
		 {
			 throw new ManagerNotFoundException("User not Found");
		 }
	}
	
	
	

	/**
	 * This is for get List of HrManager 
	 * @exception  ManagerNotFoundException it is in exception package and handle by Globle Handler
	 * 
	 * */
	public List<Hr> getAllHr()
	{
		
		List<Hr>list=repo.findAll();
		
		if(list==null) {
			throw new ManagerNotFoundException("User not Found");
		}
		return list;
	}
	
	
	

	/**
	 * This is for verify the user using findByUserName Method
	 * @exception  NullPointerException it is in exception package and handle by Globle Handler
	 * 
	 * */
	
	public Hr verifyLogin(String username, String password) {
	
	     return repo.findByUsernameAndPassword(username,password);
	  
//	     if(hr==null) {
//				throw new NullPointerException("Username And Password is Incorrect");
//			}
//			else if(hr.getPassword().equals(password)) {
//				
//				return true;	
//			}else {
//				throw new NullPointerException("Username And Password is Incorrect");
//			}
//	
		
	}
	
	
	/**
	 * This is for update HrManager 
	 * @exception  ManagerNotFoundException it is in exception package and handle by Globle Handler
	 * 
	 * */
	public boolean updateHr(Hr h) {
        @SuppressWarnings("deprecation")
        Hr hr=    repo.getById(h.getId());
        hr.setUsername(h.getUsername().trim());
       hr.setName(h.getName());
        hr.setCompanyname(h.getCompanyname());
        hr.setForpost(h.getForpost());
        hr.setExperience(h.getExperience());
        hr.setSkills(h.getSkills());
        hr.setMobile(h.getMobile());
        hr.setEmail(h.getEmail());
      hr.setIsActive(h.getIsActive());
        Hr updateHr =repo.save(hr);
        if(updateHr!=null)
        	return true;
        throw new ManagerNotFoundException("User not Found");
            
        }

	

	/**
	 * This is for get HrManager object using getBYId
	 * @exception  ManagerNotFoundException it is in exception package and handle by Globle Handler
	 * 
	 * */
        @SuppressWarnings("deprecation")
        public Hr getBYId(int id) {
            
        	Hr hr=repo.getById(id);
        	if(hr!=null) {
        		return hr;
        	}
        	else 
        	throw new ManagerNotFoundException("User not Found");
            
        }
	
        

    	/**
    	 *To count how many entity are stored in database
    	 * @exception  ManagerNotFoundException it is in exception package and handle by Globle Handler
    	 * 
    	 * */
        public long count1() {
        			Long count =repo.count();
        			return count;
        	}
        
        /**
    	 *for change password
    	 * @exception  ManagerNotFoundException it is in exception package and handle by Globle Handler
    	 * 
    	 * */
        public boolean verifyUsername(String oldpassword, String newpassword,String username) {
            Hr hr=repo.findByUsername(username);
            if(hr.getPassword().equals(oldpassword)) {
                hr.setPassword(newpassword);
                repo.save(hr);
                return true;
            }
            else {
                throw new ManagerNotFoundException("Password is not correct");
            }
        }
        
     
	
}

