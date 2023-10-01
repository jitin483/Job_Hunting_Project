package com.mvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 
 * @exception
 * for handling null pointer exception
 *
 */
public class NullPoniterException extends RuntimeException {

	public NullPoniterException(String message) {
		super(message);
		
	}
	
	

}
