package com.mvc.controllers;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.models.Hr;
import com.mvc.models.Jobs;
import com.mvc.models.User;
import com.mvc.services.HrService;
import com.mvc.services.JobService;
import com.mvc.services.UserServices;
/**
 * @author JitinKumar,AbhishekChaudhry,DakshKausik,ShubhamSharma
 *  This is Admin Controller where  handle the all landing pages of Admin admin what can see what can't see
 * 
 */

@Controller
@RequestMapping(path = "/admin")
public class AdminController {
	@Autowired
	private UserServices userservice;

	@Autowired
	private HrService hrservice;
	
	@Autowired
	private JobService jservice;
	
	
	/**
	 * @return adminLogin page
	 **/
	
	@GetMapping(value = "/login")
	public String login(Model model) {
		return "loginAdmin";
	}
	
	
	
/**
 * @param username
 * @param password
 * @return adminHomepage
 * @return adminlogin page
 * */
	@PostMapping(value = "/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpSession session, Model model) {
		String uname = "admin";
		String pass = "password";
		if (username.equals(uname) && password.equals(pass)) {
			List<User> list = userservice.getUsers();
			List<Hr> Hrlist = hrservice.getAllHr();
			List<Jobs> job = jservice.getAllJobs();
			model.addAttribute("uname",uname);
			model.addAttribute("list", list);
			model.addAttribute("Hrlist", Hrlist);
			model.addAttribute("job", job);
			//count number of manager
			long count11=hrservice.count1();
			model.addAttribute("countHr", count11);
			//count number of Jobs
			long countjobs=jservice.count();
			model.addAttribute("countJobs", countjobs);
			//count number of users
			long countUsers=userservice.count();
			model.addAttribute("countUsers", countUsers);
			
			return "homePageAdmin";
		} else {
		
			session.setAttribute("msg0", "Username & Password is Incorrect");
			return "loginAdmin";
		}
	}
	
	
	
	
	/**
	 * @return login admin page 
	 * This is for logout
	 **/	
	@GetMapping(value = "/logout")
		public String logout( HttpSession session) {
			session.invalidate();
			return "loginAdmin";
		}


	
	/**
	 *@return update HrManager page 
	 *@param id for get the object of hrManager
	 **/
	@GetMapping(value="/updatehr")
    public String update(@RequestParam("id") int id,Model m) {
        Hr oldhr =    hrservice.getBYId(id);
        m.addAttribute("hr", oldhr);
        return "update_hr";
    }
	
	
    /**
     *@return  View_registered_Hr  
     *
     **/
    @PostMapping(value="/updateform" )
    public String update(Hr hr,HttpSession session, Model model) {
    hrservice.updateHr(hr);
    List<User> list = userservice.getUsers();
    List<Hr> Hrlist = hrservice.getAllHr();
    List<Jobs> job = jservice.getAllJobs();
    model.addAttribute("hr",Hrlist);
    model.addAttribute("list", list);
    model.addAttribute("Hrlist", Hrlist);
    model.addAttribute("job", job);
    return"View_registered_Hr";
    }
    
    
    /**
     *@return update user page  
     *@param id for get users
     *
     **/
    @GetMapping(value="/updateuser")
    public String updateUser(@RequestParam("id") int id,Model m) {
        User olduser = userservice.getUserById(id);
        m.addAttribute("user",olduser);
        return "Update_User";
    }
    
    /**
     *@return  View_registered_Users page  
     *
     **/
    @PostMapping(value="/updateform1" )
    public String updateUser(User user,HttpSession session, Model model) {
    userservice.updateUser(user);
    List<User> u = userservice.getUsers();
    model.addAttribute("user",u);
    List<User> list = userservice.getUsers();
    model.addAttribute("list", list);
    return "View_registered_Users";
    }
    
    
    /**
     *@return  View_User page  
     *@param id
     *
     **/
    @GetMapping(value="/viewuser")
    public String viewUser(@RequestParam("id") int id,Model m) {
        User olduser =    userservice.getUserById(id);
        m.addAttribute("user",olduser);
        return "View_User";
    }
    
    
    
    /**
     *@return  view_hr_details page  
     *@param id
     *
     **/
    @GetMapping(value="/viewhr")
    public String viewHR(@RequestParam("id") int id,Model m) {
        Hr oldhr =    hrservice.getBYId(id);
        m.addAttribute("hr", oldhr);
        return "view_hr_details";
    }
    
    
    /**
     *@return  homePageAdmin page  
     *for showing jobs count on dashboard grid
     **/
    @GetMapping(value = "/dashboard")
	public String dashboard(Model model) {

    	
    	//count number of hrmanager
		long count11=hrservice.count1();
		model.addAttribute("countHr", count11);
		
		//count number of Jobs
		long countjobs=jservice.count();
		model.addAttribute("countJobs", countjobs);
		
		
		//count number of users
		long countUsers=userservice.count();
		model.addAttribute("countUsers", countUsers);
		
		return "homePageAdmin";
	}
    
    
    /**
     *@return View_registered_Hr page  
     **/
    @GetMapping(value = "/ViewHr")
	public String ViewHr(Model model) {     	
		List<Hr> Hrlist = hrservice.getAllHr();		
		model.addAttribute("Hrlist", Hrlist);		
		return "View_registered_Hr";
	}
    
    
    /**
     *@return View_registered_Users page  
     **/
    @GetMapping(value = "/ViewUsers")
	public String ViewUsers(Model model) {     	
    	List<User> list = userservice.getUsers();	
    	model.addAttribute("list", list);	
		return "View_registered_Users";
	}
    
    /**
     *@return user-profile page  
     **/
    @GetMapping(value = "/userProfile")
	public String userProfile(Model model) {
		return "user-profile";
	}
    
    
    /**
     *@return postedjobs page  
     *This is for showing postedjobs
     **/
    @GetMapping(value = "/ViewJobs")
	public String ViewJobs(Model model) {     	
    	List<Jobs> job = jservice.getAllJobs();	
    	model.addAttribute("job", job);	
		return "postedjobs";
	}
    
    
}

