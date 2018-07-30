package com.juancrud.gym.services.models;

public abstract class EntityModel<ID> {
	
	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

}
