package com.juancrud.gym.dao;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Trainer extends EntityWithId {

	@Column (name = "Status")
	private TrainerStatusEnum status;
	
	public Trainer() {
	}
	
	public Trainer(TrainerStatusEnum status) {
		setStatus(status);
	}

	public TrainerStatusEnum getStatus() {
		return status;
	}

	public void setStatus(TrainerStatusEnum status) {
		this.status = status;
	}

}
