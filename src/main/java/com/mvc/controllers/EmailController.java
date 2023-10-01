package com.mvc.controllers;

import java.util.List;


//Defines various API for Sending Mail
//Importing required classes

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.mvc.models.EmailDetails;
import com.mvc.models.User;
import com.mvc.services.EmailService;
import com.mvc.services.UserServices;

//Annotation
@Controller
//Class
public class EmailController {
	
	@Autowired
	private UserServices userservice;

	@Autowired 
	private EmailService emailService;

	// Sending a simple Email
	@GetMapping("/sendMail")
	public String
	sendMail(@ModelAttribute EmailDetails details)
	{
		//List<User> user=userservice.getUsers();
		//details.setRecipient(user.get(0).getEmail());
		details.setRecipient("jitin483gmail.com");
		details.setSubject("Tsting purpuse");
		details.setMsgBody("Hey !  \n This is for testing purpose only");

		String status= emailService.sendSimpleMail(details);

		return status;
		
		
		
		
		
		
		
		
		
	}

	// Sending email with attachment
	@PostMapping("/sendMailWithAttachment")
	public String sendMailWithAttachment(@ModelAttribute EmailDetails details)
	{
		List<User> user=userservice.getUsers();
		details.setRecipient(user.get(0).getEmail());
		details.setSubject("Tsting purpuse");
		details.setMsgBody("Hey !  "+user.get(0).getName() +"\n This is for testing purpose only");
		details.setAttachment("C:\\Users\\Administrator\\Desktop\\empdata1.xlsx");
		
		String status = emailService.sendMailWithAttachment(details);
		
		return status;
	}
}
