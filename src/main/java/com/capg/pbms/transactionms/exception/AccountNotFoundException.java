package com.capg.pbms.transactionms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Customer Not Found", value = HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends RuntimeException{
	
	public AccountNotFoundException(String message) 
	{
		
		super(message);
	}


}
