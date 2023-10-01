package com.mvc.exception;

public class DuplicateUserFoundException extends RuntimeException {

	/**
	 * this for duplicate user found in database
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateUserFoundException(String message) {
		super(message);
		
	}
	
	

}
