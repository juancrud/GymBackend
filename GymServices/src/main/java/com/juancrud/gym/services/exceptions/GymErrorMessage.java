package com.juancrud.gym.services.exceptions;

import java.util.Date;

public class GymErrorMessage {
	
	private Date timestamp;
	private String message;
	private String details;
	private String stacktrace;
	
	public GymErrorMessage(Date timestamp, String message, String details, String stacktrace) {
		setTimestamp(timestamp);
		setMessage(message);
		setDetails(details);
		setStacktrace(stacktrace);
	}

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

	public String getStacktrace() {
		return stacktrace;
	}

	public void setStacktrace(String stacktrace) {
		this.stacktrace = stacktrace;
	}
	
}
