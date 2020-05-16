package com.capg.pbms.transactionms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Insufficient Balance", value = HttpStatus.NOT_FOUND)
public class InsufficientBalanceException extends RuntimeException{
	
	
	
	public InsufficientBalanceException(String message) 
	{
		
		super(message);
	}

}
