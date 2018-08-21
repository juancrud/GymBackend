package com.juancrud.gym.dao;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
public abstract class EntityWithIdAndImage extends EntityWithId {

	@JoinColumn(name="MediaId")
	@OneToOne (cascade = CascadeType.ALL)
	private Media image;

	public Media getImage() {
		return image;
	}

	public void setImage(Media image) {
		this.image = image;
	}
	
}
