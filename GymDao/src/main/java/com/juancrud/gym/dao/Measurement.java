package com.juancrud.gym.dao;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.juancrud.gym.dao.enums.MeasurementStatusEnum;

@Entity
public class Measurement extends EntityWithId {
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Description")
	private String description;
	
	@Column (name = "Status")
	private MeasurementStatusEnum status;
	
	public Measurement() {
	}
	
	public Measurement(String name, String description, MeasurementStatusEnum status) {
		setName(name);
		setDescription(description);
		setStatus(status);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MeasurementStatusEnum getStatus() {
		return status;
	}

	public void setStatus(MeasurementStatusEnum status) {
		this.status = status;
	}
	
}
