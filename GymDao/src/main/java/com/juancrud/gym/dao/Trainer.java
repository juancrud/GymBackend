package com.juancrud.gym.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.juancrud.gym.dao.enums.TrainerStatusEnum;

@Entity
public class Trainer extends EntityWithId {

	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name = "personId", nullable = false)
	private Person person;
	
	@Column (name = "Status", nullable = false)
	private TrainerStatusEnum status;
	
	@OneToMany(mappedBy="trainer")
	private Set<MeasurementItem> measurementItems;
	
	@OneToMany(mappedBy="trainer")
	private Set<Routine> routines;
	
	public Trainer() {
		measurementItems = new HashSet<MeasurementItem>();
		routines = new HashSet<Routine>();
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
	
	public void addRoutine(Routine routine) {
		routines.add(routine);
		routine.setTrainer(this);
	}
	
	public void removeRoutine(Routine routine) {
		routines.remove(routine);
		routine.setTrainer(null);
	}

}
