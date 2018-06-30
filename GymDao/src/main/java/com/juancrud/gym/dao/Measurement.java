package com.juancrud.gym.dao;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Measurement extends EntityWithId {
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Description")
	private String description;
	
	public Measurement() {
	}
	
	public Measurement(String name, String description) {
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
