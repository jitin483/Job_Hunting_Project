package com.mvc.exception;

public class ManagerNotFoundException extends RuntimeException {

	/**
	 * user Manager Not Found in database
	 * @param message
	 */
	public ManagerNotFoundException(String message) {
		super(message);
		
	}

}
