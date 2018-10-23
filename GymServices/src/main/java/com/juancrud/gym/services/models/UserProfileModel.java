package com.juancrud.gym.services.models;

import com.juancrud.gym.dao.enums.UserTypeEnum;

public class UserProfileModel {
	
	private String emailAddress;
	private UserTypeEnum type;
	
	public UserProfileModel() {
	}
	
	public UserProfileModel(String emailAddress, UserTypeEnum type) {
		setEmailAddress(emailAddress);
		setType(type);
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public UserTypeEnum getType() {
		return type;
	}
	
	public void setType(UserTypeEnum type) {
		this.type = type;
	}
	
}
