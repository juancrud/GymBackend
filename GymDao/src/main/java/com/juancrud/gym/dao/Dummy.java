package com.juancrud.gym.dao;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Dummy extends AuditableEntityWithId {

	@Column (name = "Name")
	private String name;
	
	@Column (name = "Description")
	private String description;
	
	public Dummy() {
	}
	
	public Dummy(String name, String description) {
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
