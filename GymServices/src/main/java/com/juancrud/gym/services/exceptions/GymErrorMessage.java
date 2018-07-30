package com.juancrud.gym.services.exceptions;

import java.util.Date;

public class GymErrorMessage {
	
	private Date timestamp;
	private String request;
	private String message;
	private String stacktrace;
	
	public GymErrorMessage(Date timestamp, String request, String message, String stacktrace) {
		setTimestamp(timestamp);
		setRequest(request);
		setMessage(message);
		setStacktrace(stacktrace);
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStacktrace() {
		return stacktrace;
	}

	public void setStacktrace(String stacktrace) {
		this.stacktrace = stacktrace;
	}
	
}
