package com.juancrud.gym.api.exceptions;

@SuppressWarnings("serial")
public class GymApiException extends Exception {
	
	private String controller;
	
	public GymApiException(String controller, String message) {
		this(controller, message, null);
	}
	
	public GymApiException(String controller, String message, Throwable cause) {
		super(message, cause);
		setController(controller);
	}

	public String getController() {
		return controller;
	}

	public void setController(String controller) {
		this.controller = controller;
	}
	
}
