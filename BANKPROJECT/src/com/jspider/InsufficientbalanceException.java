package com.jspider;

public class InsufficientbalanceException extends RuntimeException {
	private String message;
	InsufficientbalanceException(String message){
		this.message=message;	
	}
	@Override
	public String getMessage(){
		return message;
	}

}
