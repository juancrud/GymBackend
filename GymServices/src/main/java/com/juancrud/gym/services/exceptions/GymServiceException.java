package com.juancrud.gym.services.exceptions;

@SuppressWarnings("serial")
public class GymServiceException extends Exception {
	
	private String service;
	
	public GymServiceException(String service, String message) {
		this(service, message, null);
	}
	
	public GymServiceException(String service, String message, Throwable cause) {
		super(message, cause);
		setService(service);
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

}
