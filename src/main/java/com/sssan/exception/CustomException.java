package com.sssan.exception;

public class CustomException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 167280594796194303L;

	public CustomException(){
		super();
	}
	
	public CustomException(String message){
		super(message);
	}
	
	public CustomException(String message,Exception e){
		super(message,e);
	}
	
	public CustomException(Exception e){
		super(e);
	}

}
