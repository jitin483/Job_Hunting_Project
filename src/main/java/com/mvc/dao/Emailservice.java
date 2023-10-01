package com.mvc.dao;

import com.mvc.models.EmailDetails;

public interface Emailservice {

	// Method
    // To send a simple email
	String sendSimpleMail(EmailDetails details);
	
	 // Method
    // To send an email with attachment
	String sendMailWithAttachment(EmailDetails details);
}
