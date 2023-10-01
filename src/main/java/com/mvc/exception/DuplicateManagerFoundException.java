package com.mvc.exception;

public class DuplicateManagerFoundException extends RuntimeException {

	/**
	 * @exception
	 * if User Manager Data not found in database
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateManagerFoundException(String message) {
		super(message);
		
	}
	
	

}
