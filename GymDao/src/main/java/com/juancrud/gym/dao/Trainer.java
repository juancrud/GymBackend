package com.juancrud.gym.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Trainer extends EntityWithId {

	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name = "personId")
	private Person person;
	
	@Column (name = "Status")
	private TrainerStatusEnum status;
	
	public Trainer() {
	}
	
	public Trainer(Person person, TrainerStatusEnum status) {
		setPerson(person);
		setStatus(status);
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public TrainerStatusEnum getStatus() {
		return status;
	}

	public void setStatus(TrainerStatusEnum status) {
		this.status = status;
	}

}
