package com.juancrud.gym.dao;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Customer extends EntityWithId {

	@Column (name = "Status")
	private CustomerStatusEnum status;
	
	public Customer() {
	}
	
	public Customer(CustomerStatusEnum status) {
		setStatus(status);
	}

	public CustomerStatusEnum getStatus() {
		return status;
	}

	public void setStatus(CustomerStatusEnum status) {
		this.status = status;
	}
	
}
