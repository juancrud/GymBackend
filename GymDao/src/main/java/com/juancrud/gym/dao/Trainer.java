package com.juancrud.gym.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Trainer extends EntityWithId {

	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name = "personId")
	private Person person;
	
	@Column (name = "Status")
	private TrainerStatusEnum status;
	
	@OneToMany(mappedBy="trainer")
	private Set<MeasurementItem> measurementItems;
	
	public Trainer() {
		measurementItems = new HashSet<MeasurementItem>();
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
	
	public void addMeasurementItem(MeasurementItem measurementItem) {
		measurementItems.add(measurementItem);
		measurementItem.setTrainer(this);
	}
	
	public void removeMeasurementItem(MeasurementItem measurementItem) {
		measurementItems.remove(measurementItem);
		measurementItem.setTrainer(null);
	}

}
