package com.juancrud.gym.dao;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@MappedSuperclass
public abstract class AuditableEntityWithId extends EntityWithId {

	@Column (name="DateCreated", nullable = false)
	@CreationTimestamp
	private Timestamp dateCreated;
	
	@Column (name="DateUpdated", nullable = false)
	@UpdateTimestamp
	private Timestamp dateUpdated; 

	public Timestamp getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Timestamp dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
}
