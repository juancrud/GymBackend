package com.juancrud.gym.services.exceptions;

@SuppressWarnings("serial")
public class GymServiceException extends RuntimeException {
	
	private String service;
	
	public GymServiceException(String message) {
		this(message, null);
	}
	
	public GymServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

}
