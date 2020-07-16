package com.emmalif.VMS.RESTwebservice;

import java.util.Date;

//This class to make a custom structure for exceptions, and return exceptions in this format to simplify
public class ExceptionDetails {
	private Date timestamp; 
	private String message; 
	private String details;
	
	//Constructor
	public ExceptionDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	//Getters and Setters
	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	} 
}
