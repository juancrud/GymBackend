package com.juancrud.gym.dao;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class MeasurementItem extends EntityWithId {

	@Column(name="Date")
	private Timestamp date;
	
	@Column(name="Comments")
	private String comments;
	
	@ManyToOne
	@JoinColumn(name = "TrainerId")
	private Trainer trainer;
	
	@ManyToOne
	@JoinColumn(name = "CustomerId")
	private Customer customer;
	
	@OneToMany(mappedBy="measurementItem")
	private Set<MeasurementItemLine> measurementItemLines;
	
	@OneToOne
	@JoinColumn(name = "RoutineId")
	private Routine routine;
	
	public MeasurementItem() {
	}
	
	public MeasurementItem(Timestamp date, String comments, Trainer trainer, Customer customer, Routine routine) {
		setDate(date);
		setComments(comments);
		setTrainer(trainer);
		setCustomer(customer);
		setRoutine(routine);
	}
	
	public MeasurementItem(Timestamp date, String comments, Trainer trainer, Customer customer, Routine routine, Collection<MeasurementItemLine> measurementItemLines) {
		this(date, comments, trainer, customer, routine);
		//measurementItemLines.forEach(this::addMeasurementItemLine);
		for(MeasurementItemLine mil : measurementItemLines) {
			this.addMeasurementItemLine(mil);
		}
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Routine getRoutine() {
		return routine;
	}

	public void setRoutine(Routine routine) {
		this.routine = routine;
	}
	
	public void addMeasurementItemLine(MeasurementItemLine measurementItemLine) {
		measurementItemLines.add(measurementItemLine);
		measurementItemLine.setMeasurementItem(this);
	}
	
	public void removeMeasurementItemLine(MeasurementItemLine measurementItemLine) {
		measurementItemLines.remove(measurementItemLine);
		measurementItemLine.setMeasurementItem(null);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof MeasurementItem)) return false;
		return getId() != null && getId().equals(((MeasurementItem)o).getId());
	}
	
	@Override
	public int hashCode() {
		return 31;
	}
	
}
