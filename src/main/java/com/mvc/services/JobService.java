package com.mvc.services;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.JobsRepository;
import com.mvc.exception.DuplicateManagerFoundException;
import com.mvc.models.Jobs;
import com.mvc.models.User;

/**
 * @author JitinKumar,AbhishekChaudhry,DakshKausik,ShubhamSharma
 * 
 * */
@Service
public class JobService {
	
@Autowired
	private JobsRepository jobrepo;

/**
 * This is for create new job
 * */
public boolean postNewJob(Jobs job)
{
	Jobs j=jobrepo.save(job);
	if(j!=null) {
		return true;
	}
	return false;
}

/**
 * 
 * @return List of all jobs
 * */
public List<Jobs> getAllJobs()
{
	return jobrepo.findAll();
}

public List<Jobs> getAllHrJobs(String hrName){
	List<Jobs> hrjob= jobrepo.findByhrName(hrName);
		if(hrjob!=null) {
			return hrjob;
		}
		else 
			return null;
		
	}
public boolean updateJobs(Jobs u) {
    @SuppressWarnings("deprecation")
    Jobs jobs=    jobrepo.getById(u.getId());
    jobs.setHrName(u.getHrName());
    jobs.setCompanyName(u.getCompanyName());
    jobs.setJobprofile(u.getJobprofile());
    jobs.setLocation(u.getLocation());
    jobs.setJobType(u.getJobType());
    jobs.setSkillsRequired(u.getSkillsRequired());
    jobs.setExperience(u.getExperience());
    jobs.setIsActive(u.getIsActive());
    
   jobs.setValidTill(u.getValidTill());

   Jobs updateJobs =jobrepo.save(jobs);
    if(updateJobs!=null)return true;
        return false;
        
    }

    @SuppressWarnings("deprecation")
    public Jobs getBYId(int id) {
        
        return  jobrepo.getById(id);
        
    }
    
   //Get all active jobs
    public List<Jobs> getAllActiveJobs(){
    	
    	List<Jobs> job=getAllJobs();
    	List<Jobs> isActiveJob=new ArrayList<>();
    	
    	for (Jobs jobs : job) {
    		if(jobs.getIsActive().equalsIgnoreCase("Yes")) {
    			isActiveJob.add(jobs);
    		}
			
		}
		return isActiveJob; 	
    }
    
  //Get all inactive jobs
    public List<Jobs> getAllInActiveJobs(){
    	
    	List<Jobs> job=getAllJobs();
    	List<Jobs> isActiveJob=new ArrayList<>();
    	
    	for (Jobs jobs : job) {
    		if(jobs.getIsActive().equalsIgnoreCase("No")) {
    			isActiveJob.add(jobs);
    		}
			
		}
		return isActiveJob; 	
    }
    
    
    
    
    
    
  //To count how many jobs are stored in database 
    public long count() {
    	return jobrepo.countJobs();
	
    }
    
    
  //To count how many Activejobs are stored in database 
    public long activejobscount() {
    	return jobrepo.countactiveJobs();
	
    }
    
    
    //To count how many InActivejobs are stored in database 
    public long inactivejobscount() {
    	return jobrepo.countInactiveJobs();
	
    }
    

   
}


