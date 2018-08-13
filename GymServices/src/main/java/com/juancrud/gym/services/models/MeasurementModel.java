package com.juancrud.gym.services.models;

import com.juancrud.gym.dao.enums.MeasurementStatusEnum;

public class MeasurementModel extends EntityModel<Integer> {

	private String name;
	private String description;
	private MeasurementStatusEnum status;
	
	public MeasurementModel() {
	}
	
	public MeasurementModel(Integer id, String name, String description, MeasurementStatusEnum status) {
		setId(id);
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
