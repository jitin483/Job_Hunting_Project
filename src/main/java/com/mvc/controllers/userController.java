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

import com.mvc.models.Jobs;
import com.mvc.models.User;
import com.mvc.services.JobService;
import com.mvc.services.UserServices;

/**
 * @author JitinKumar
 * This is User Controller where  handle the all landing pages of User
 * 
 */

@Controller
@RequestMapping("/user")
public class userController {
	@Autowired
	private UserServices userservice;
	
	@Autowired
	private JobService jservice;
	
	
	/**
	 * @return login user page
	 **/
	@GetMapping("/login")
	public String login()
	{

		return "loginUser";
	}
	
	
	/**
	 * @return login user page
	 * @param username
	 * @param password
	 * 
	 **/
	
	@PostMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,Model model,HttpSession session) {

		
		
		if (userservice.verifyLogin(username, password)!=null) {
			User u=userservice.getUsers(username);
			List<Jobs> joblist=jservice.getAllJobs();
			
			session.setAttribute("Username", u.getUsername());
			model.addAttribute("job", joblist);
			long jobs= jservice.activejobscount();
	        model.addAttribute("jobcount", jobs);
			return "homePage_user";
		} 
		else {
			model.addAttribute("msg2", "Username And Password incorrect");
			return "loginUser";
		}

	}
	
	
	/**
	 * @param jobid
	 * @param userid
	 * @return viewJobs Page
	 **/
	
	@GetMapping(value="/applied")
    public String update(@RequestParam("jobid") int jobid, @RequestParam("userid") int userid,Model model) {
      Jobs job= jservice.getBYId(jobid);
      User user = userservice.getUserById(userid);

        List<Jobs> aappiedjobslist=user.getJobsApplied();

        model.addAttribute("appliedjobs", aappiedjobslist);
        user.getJobsApplied().add(job);
        userservice.applyForJob(user);
        return "redirect:/user/viewJobs";
    }
	
	/**
	 * 
	 * @return
	 */
	//user registration
	@GetMapping("/register")
	public String register()
	{
		return "registerUser";
	}
	
	/**
	 * 
	 * @param user
	 * @param model
	 * @return
	 */
	@PostMapping("/register")
	public String Register(@ModelAttribute User user, Model model)
	{
		if (userservice.createNewUser(user)){
					model.addAttribute("message", "Registration Successfully");
			return "loginUser";
			
		}model.addAttribute("message", "Please fill correct data");
		return "registerUser";
		}
	
	/**
	 * 
	 * @param model
	 * @param session
	 * @return
	 */
	@GetMapping(value = "/logout")
	public String login(Model model, HttpSession session) {
		session.invalidate();
		return "loginUser";
	}
	
	/**
	 * 
	 * @param model
	 * @param session
	 * @return
	 */
	@GetMapping(value="/viewJobs")
	public String backToApply(Model model,HttpSession session ) {
		List<Jobs> joblist=jservice.getAllActiveJobs();
		String Userame =(String)session.getAttribute("Username");
		User u=userservice.getUsers(Userame);
		model.addAttribute("userId",u.getId());
		
//		String user_id =(String)session.getAttribute("userid");
//		int user = Integer.parseInt(user_id);
//	    model.addAttribute("userid", user);
		
		model.addAttribute("job", joblist);
		return "viewJobs";
	}
	/**
	 * 
	 * @param model
	 * @param session
	 * @return
	 */
	@GetMapping(value="/appliedJobs")
	public String appliedJobs(Model model ,HttpSession session ) {
	String Username=(String) session.getAttribute("Username");
	
		User u=userservice.getUsers(Username);
		List<Jobs> aappiedjobslist=u.getJobsApplied();
		model.addAttribute("appliedJoblist",aappiedjobslist);
		return "AplJobs_User";
	}
	/**
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping(value="/dashboard")
	public String dashboard(Model model) {
	        long jobs= jservice.activejobscount();
	        model.addAttribute("jobcount", jobs);
	    return "homePage_user";
	}
	
	/**
	 * 
	 * @param id
	 * @param m
	 * @return
	 */
	@GetMapping(value="/viewJobDetail")
    public String viewJobDetail(@RequestParam("id") int id,Model m) {
      Jobs job =    jservice.getBYId(id);
      m.addAttribute("job",job);
      return "View_Job_Detailsuser";
  }

	/**
	 * 
	 * @return
	 */
	//setting for change password
	@GetMapping("/Change-passwordUser")
    public String Changepassword() {
        return "Change-passwordUser";
    }
	/**
	 * 
	 * @param oldpassword
	 * @param newpassword
	 * @param session
	 * @param model
	 * @return
	 */
    @PostMapping("/Change-passwordUser")
    public String changePassword(@RequestParam("oldpasssword") String oldpassword , @RequestParam("newpasssword") String newpassword,
            HttpSession session, Model model)
    {
        String Username = (String)session.getAttribute("Username");
        System.out.println(Username);
        
        if(userservice.verifyUsername(oldpassword, newpassword, Username)) {
            return "homePage_user";
            
        }
        return "change-password";
   }
    
}

