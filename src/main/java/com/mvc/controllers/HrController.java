package com.mvc.controllers;




import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.mvc.models.Hr;
import com.mvc.models.Jobs;
import com.mvc.services.HrService;
import com.mvc.services.JobService;



/**
 * @author JitinKumar,AbhishekChaudhry,DakshKausik,ShubhamSharma
 * This is Manager Controller where  handle the all landing pages
 * 
 */

@Controller
@RequestMapping("/HrManager")
public class HrController {
	@Autowired
	private HrService Hrservice;
	@Autowired
	private JobService jobservice;
 
	/**
	 *@return loginHR page
	 *return loginHR page
	 */
 @GetMapping("/login")
	public String login()
	{

		return "loginHR";
	}
 
 
  /**
   *
   *
   *@param username
   *@param password
   *@return Dashboard_hr
   *@return loginHR
   *this is for login and verifylogin method verify the users
   */
	@PostMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpSession session, Model model) {
		
		
		if (Hrservice.verifyLogin(username, password)!=null) {
			Hr hr=Hrservice.getHr(username);
			  String hrusername = hr.getUsername();
	         String HrupdateDetails=hr.getUsername();
			 
	         //for Showing job list to current login HrManager
			List<Jobs> jk =jobservice.getAllHrJobs(hrusername);

			model.addAttribute("jobs",jk);
			model.addAttribute("hr", hr);
			session.setAttribute("hr",hr);
			
			session.setAttribute("hrusername", hrusername);
           session.setAttribute("HrupdateDetails", HrupdateDetails);
        
		
			 //count total jobs for showing in the card
			 Long count=jobservice.count();
			 model.addAttribute("jobscount",count);
			
			 //count active jobs for showing in the card
		  Long countactivejobs=jobservice.activejobscount();
		  model.addAttribute("activecount",countactivejobs);
		  
		//count inactive jobs for showing in the card
		  Long countinactivejobs=jobservice.inactivejobscount();
		  model.addAttribute("inactivecount",countinactivejobs);
		  
		
		 
			return "Dashboard_hr";
		} else {
			 model.addAttribute("msg1", "Username & Password is Incorrect");
			return "loginHR";
		}

	}
	
	
	/**
	 *@return registerHR
	 *
	 */
	@GetMapping("/register")
	public String register()
	{
		return "registerHR";
	}
	
	
	/**
	 * 
	 *@return loginHR page
	 *@return registerHR
	 *
	 */
	@PostMapping("/register")
	public String Register(@ModelAttribute Hr hr, Model model)
	{
		//call createNewHr method from service to create new HrManager
		if (Hrservice.createNewHr(hr)){
			model.addAttribute("register", "You Are Register successfully || Please Login Here");		
			return "loginHR";
			
		}return "registerHR";
	
		}
	
	
	

	/**
	 * 
	 *@return loginHR page
	 *this is for logout
	 *
	 */
	@GetMapping(value = "/logout")
	public String logout(Model model, HttpSession session) {
		session.invalidate();
		model.addAttribute("messagel", "Logout SucessFully");
		return "loginHR";
	}
	
	
	
	

	/**
	 * 
	 *@return addJobs_hr page where we can add jobs details
	 *
	 *
	 */
	@RequestMapping("/jobs")
	public String addJobs() {
		
		return "addJobs_hr";
		
	}
	
	
	/**
	 * 
	 *@return postedjobs_hr
	 *
	 *for posting jobs &showing in HrManager panel
	 */
	@PostMapping("/jobs")
	public String addjob(@ModelAttribute Jobs job,Model model) {
	
	jobservice.postNewJob(job);
	List<Jobs> jk =jobservice.getAllJobs();
	model.addAttribute("job",jk);
	
		model.addAttribute("message" ,"posted jobs Successfully");
		return "postedjobs_hr";
	}
	
	
	/**
	 * @param id 
	 *@return updatejobs_hr page
	 *
	 *for getting job list jobs &showing in HrManager panel
	 */
	@GetMapping(value="/update")
    public String update(@RequestParam("id") int id,Model model) {
        Jobs oldjobs =    jobservice.getBYId(id);
        List<Jobs> jk =jobservice.getAllJobs();
      
        model.addAttribute("hr",oldjobs);
        model.addAttribute("job",jk);
        jobservice.updateJobs(oldjobs);
        
        return "updatejobs_hr";
    }
    
	
	
	/**
	 * 
	 *@return postedjobs_hr page
	 *
	 *for getting job list
	 */
    @PostMapping(value="/updateform" )
    public String update(Jobs job,HttpSession session, Model model) {
 
    //call update jobs method from service & get all jobs using list for showing in posted jobs
    jobservice.updateJobs(job);
    List<Jobs> jobs = jobservice.getAllJobs();
    model.addAttribute("job",jobs);
    model.addAttribute("hr",jobservice.updateJobs(job));
    return"postedjobs_hr";
    }
    
    

	/**
	 * 
	 *@return postedjobs_hr page
	 *
	 *for showing in HrManager panel
	 */
	 @GetMapping("viewJobs_hr")
		public String viewhr(Model model) {
		 List<Jobs> jk =jobservice.getAllJobs();
			model.addAttribute("job",jk);
			
			return "postedjobs_hr";
			
		}
				
	 
	 /**
		 * 
		 *@return Dashboard_hr page
		 *
		 *for showing activeJobs,InActiveJobs,TotalJobs count number of jobs available in HrManager grid panel
		 */
	 @GetMapping("/dashboard")
	 public String dashboard(Model model ) {
		 
		 //count total jobs for showing in the card
		 Long count=jobservice.count();
		 model.addAttribute("jobscount",count);
		
		 //count active jobs for showing in the card
	  Long countactivejobs=jobservice.activejobscount();
	  model.addAttribute("activecount",countactivejobs);
	  
	//count inactive jobs for showing in the card
	  Long countinactivejobs=jobservice.inactivejobscount();
	  model.addAttribute("inactivecount",countinactivejobs);
		 
		 return "Dashboard_hr";
	 }
	 
	 
	 /**
		 * 
		 *@return hr-profile page
		 *for get all profile data from session
		 *
		 */
	 @GetMapping("/ManagerProfile")
	 public String managerprofile( ){
		 return "hr-profile";
	 }
	
	 
	 
	 /**
		 * 
		 *@return active-jobs page
		 *
		 *Show Active Jobs in active-jobs page & get all active job list from database
		 **/
	
	 @GetMapping("activejobs")
	 public String activejobs(Model model) {
		 List<Jobs>activejobs=jobservice.getAllActiveJobs();
		 model.addAttribute("activejobs", activejobs); 
		 return "active-jobs";
	 }

	 /**
		 * 
		 *@return Inactive-jobs page
		 *
		 *Show InActive Jobs in Inactive-jobs page & get all InActive job list from database
		 **/
	 @GetMapping("inactivejobs")
	 public String Inactivejobs(Model model) {
		List<Jobs>inactivejobs=jobservice.getAllInActiveJobs();
		 model.addAttribute("inactivejobs",inactivejobs); 
		 return "Inactive-jobs";
	 }
	 
	 
	 /**
		 * 
		 *@return AppliedJobs_User page
		 *
		 **/
	 @GetMapping("ShowAppliedJobs")
	 public String showAppliedJobsByUser(Model model) {
			 
		 return "AppliedJobs_User";
	 }
	 
	 

	 /**
		 * @param id for get the object of job
		 *@return View_Job_Detailshr page
		 *
		 *
		 **/
	 @GetMapping(value="/viewJobDetail")
     public String viewJobDetail(@RequestParam("id") int id,Model m) {
       Jobs job =    jobservice.getBYId(id);
       m.addAttribute("job",job);
       return "View_Job_Detailshr";
   }
	 
	 
	 /**
	  * 
	  *it is for  change password of HrManager
	  **/
     @GetMapping("/Change-PasswordHR")
       public String Changepassword() {
           return "Change-PasswordHR";
       }
     
     
     /**
		 * @param oldpassword 
		 * @param newpassword
		 *@return Change-PasswordHR page
		 *@return Dashboard_hr page
		 *it is for  change password of HrManager
		 **/
     @PostMapping("/Change-PasswordHR")
     public String changePassword(@RequestParam("oldpasssword") String oldpassword , @RequestParam("newpasssword") String newpassword,
                HttpSession session, Model model)
        {
            String username = (String)session.getAttribute("hrusername");
            
            if(Hrservice.verifyUsername(oldpassword, newpassword, username)) {
                return "Dashboard_hr";
                
            }
            
            return "Change-passwordHR";
        }
     
     
     
       
}


