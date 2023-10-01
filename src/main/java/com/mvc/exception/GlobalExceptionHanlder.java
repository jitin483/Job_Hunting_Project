package com.mvc.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHanlder {
	@ExceptionHandler(DuplicateUserFoundException.class)
	public String handleDuplicateUserException(DuplicateUserFoundException ex, Model model)
	{
		model.addAttribute("message", ex.getMessage());
		return "error";
	}
	
	
	
	@ExceptionHandler(UserNotFoundException.class)
	public String HandleUserNotFoundException(UserNotFoundException ex,Model model) {
		model.addAttribute("message", ex.getMessage());
		
		return "error";
		
	}
	
	
	
	@ExceptionHandler(NullPointerException.class)
	public String HandleNullPoniterException(NullPoniterException ex,Model model) {
		model.addAttribute("message", ex.getMessage());
		return "error";	
		}
	
	@ExceptionHandler(ManagerNotFoundException.class)
	public String HandleManagerNotFoundException(ManagerNotFoundException ex,Model model) {
		model.addAttribute("message", ex.getMessage());
		
		return "error";
	
}
	
}