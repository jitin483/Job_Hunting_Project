package com.mvc.exception;

public class UserNotFoundException extends RuntimeException {

	/**
	 *this is for handle user not found in database
	 * @param message
	 */
	public UserNotFoundException(String message) {
		super(message);
		
	}

}
