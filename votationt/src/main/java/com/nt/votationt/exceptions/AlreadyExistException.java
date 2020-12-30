package com.nt.votationt.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class AlreadyExistException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2385649896282793681L;

	public AlreadyExistException
	(String message) {
		super(message);
	}
	
}
