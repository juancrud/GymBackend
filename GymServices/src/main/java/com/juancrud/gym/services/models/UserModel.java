package com.juancrud.gym.services.models;

import com.juancrud.gym.dao.enums.UserTypeEnum;

public class UserModel extends EntityModel<Integer> {
	
	private String identityId;
	private UserTypeEnum type;
	
	public UserModel() {
	}
	
	public UserModel(Integer id, String identityId, UserTypeEnum type) {
		setId(id);
		setIdentityId(identityId);
		setType(type);
	}

	public String getIdentityId() {
		return identityId;
	}

	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public UserTypeEnum getType() {
		return type;
	}

	public void setType(UserTypeEnum type) {
		this.type = type;
	}
}
