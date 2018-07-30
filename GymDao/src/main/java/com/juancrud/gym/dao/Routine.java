package com.juancrud.gym.dao;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Routine extends EntityWithId {

	@Column(name="Date")
	private Timestamp date;
	
	@Column(name="Objectives")
	private String objectives;
	
	@Column(name="Comments")
	private String comments;
	
	@ManyToOne
	@JoinColumn(name = "TrainerId")
	private Trainer trainer;
	
	@ManyToOne
	@JoinColumn(name = "CustomerId")
	private Customer customer;
	
	@OneToOne(mappedBy="routine")
	private MeasurementItem measurementItem;
	
	public Routine(Timestamp date, String objectives, String comments, Trainer trainer, Customer customer, MeasurementItem measurementItem) {
		setDate(date);
		setObjectives(objectives);
		setComments(comments);
		setTrainer(trainer);
		setCustomer(customer);
		setMeasurementItem(measurementItem);
	}
	
	public Routine() {
		
	}
	
	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}
	
	public String getObjectives() {
		return objectives;
	}

	public void setObjectives(String objectives) {
		this.objectives = objectives;
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
	
	public MeasurementItem getMeasurementItem() {
		return measurementItem;
	}

	public void setMeasurementItem(MeasurementItem measurementItem) {
		this.measurementItem = measurementItem;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Routine)) return false;
		return getId() != null && getId().equals(((Routine)o).getId());
	}
	
	@Override
	public int hashCode() {
		return 41;
	}
	
}
