package com.juancrud.gym.services.models;

public class MeasurementModel extends EntityModel<Integer> {

	private String name;
	private String description;
	
	public MeasurementModel() {
	}
	
	public MeasurementModel(Integer id, String name, String description) {
		setId(id);
		setName(name);
		setDescription(description);
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
}
