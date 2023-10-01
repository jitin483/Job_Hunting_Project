package com.mvc.services;

import java.io.BufferedReader;

// Java Program to Illustrate Creation Of
// Service implementation class


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Flags.Flag;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.mvc.dao.Emailservice;
import com.mvc.models.EmailDetails;
import com.sun.mail.imap.IMAPFolder;

// Annotation
@Service
// Class
// Implementing EmailService interface
public class EmailService implements Emailservice {

	@Autowired private JavaMailSender javaMailSender;

	@Value("${spring.mail.username}")
	private String sender;
	@Value("${spring.mail.password}")
	private String password;

	// Creating a simple mail message
	SimpleMailMessage mailMessage=null;
	MimeMessage mimeMessage=null;
	// Method 1
	// To send a simple email
	public String  sendSimpleMail(EmailDetails details)
	{

		// Try block to check for exceptions
		try {

	
			// Creating a simple mail message
			mailMessage = new SimpleMailMessage();

			// Setting up necessary details
			mailMessage.setFrom(sender);
			mailMessage.setTo(details.getRecipient());
			mailMessage.setText(details.getMsgBody());
			mailMessage.setSubject(details.getSubject());

			// Sending the mail
			javaMailSender.send(mailMessage);
			return "Mail Sent Successfully...";
		}

		// Catch block to handle the exceptions
		catch (Exception e) {
			return "Error while Sending Mail";
		}
	}

	// Method 2
	// To send an email with attachment
	public String
	sendMailWithAttachment(EmailDetails details)
	{
		// Creating a mime message
		mimeMessage
			= javaMailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper;

		try {

			// Setting multipart as true for attachments to
			// be send
			mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
			mimeMessageHelper.setFrom(sender);
			mimeMessageHelper.setTo(details.getRecipient());
			mimeMessageHelper.setText(details.getMsgBody());
			mimeMessageHelper.setSubject(
				details.getSubject());

			// Adding the attachment
			FileSystemResource file= new FileSystemResource(new File(details.getAttachment()));
			mimeMessageHelper.addAttachment(file.getFilename(), file);

			// Sending the mail
			javaMailSender.send(mimeMessage);
			return "Mail sent Successfully";
		}

		// Catch block to handle MessagingException
		catch (MessagingException e) {

			// Display message when exception occurred
			return "Error while sending mail!!!";
		}
	}
	
	
	
	
	
	
	
	//Read received Email 
	
	

   public static void EmailReading() throws MessagingException, IOException {
       IMAPFolder folder = null;
       Store store = null;
       String subject = null;
       Flag flag = null;
       try 
       {
         Properties props = System.getProperties();
         props.setProperty("mail.store.protocol", "imaps");

         Session session = Session.getDefaultInstance(props, null);

         store = session.getStore("imaps");
         store.connect("imap.googlemail.com","sender", "password");

         //folder = (IMAPFolder) store.getFolder("[Gmail]/Spam"); // This doesn't work for other email account
         folder = (IMAPFolder) store.getFolder("inbox");// This works for both email account


         if(!folder.isOpen())
         folder.open(Folder.READ_WRITE);
         Message[] messages = folder.getMessages();
         System.out.println("No of Messages : " + folder.getMessageCount());
         System.out.println("No of Unread Messages : " + folder.getUnreadMessageCount());
         System.out.println(messages.length);
         for (int i=0; i < messages.length;i++) 
         {

           System.out.println("*****************************************************************************");
           System.out.println("MESSAGE " + (i + 1) + ":");
           Message msg =  messages[i];
           //System.out.println(msg.getMessageNumber());
           //Object String;
           //System.out.println(folder.getUID(msg)

           subject = msg.getSubject();

           System.out.println("Subject: " + subject);
           System.out.println("From: " + msg.getFrom()[0]);
          System.out.println("To: "+msg.getAllRecipients()[0]);
           System.out.println("Date: "+msg.getReceivedDate());
           System.out.println("Size: "+msg.getSize());
           System.out.println(msg.getFlags());
           System.out.println("Body: \n"+ msg.getContent());
           System.out.println(msg.getContentType());

         }
       }
       finally 
       {
         if (folder != null && folder.isOpen()) { folder.close(true); }
         if (store != null) { store.close(); }
       }

   }

	
	
}
