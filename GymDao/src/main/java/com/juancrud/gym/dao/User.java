package com.juancrud.gym.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.juancrud.gym.dao.enums.UserTypeEnum;

@Entity (name="Users")
public class User extends EntityWithId {
	
	@Column (name = "IdentityId", nullable = false)
	private String identityId;
	
	@Column (name = "Type", nullable = false)
	private UserTypeEnum type;
	
	@OneToOne
	@JoinColumn(name = "PersonId", nullable = true)
	private Person person;
	
	public User() {
	}
	
	public User(String identityId, UserTypeEnum type) {
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
