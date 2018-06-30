package com.juancrud.gym.dao;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class MeasurementItem extends EntityWithId {

	@Column(name="Date")
	private Date date;
	
	@Column(name="Comments")
	private String comments;
	
	@ManyToOne
	@JoinColumn(name = "trainerId")
	private Trainer trainer;
	
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	
	@OneToMany(mappedBy="measurementItem")
	private Set<MeasurementItemLine> measurementItemLines;
	
	public MeasurementItem() {
	}
	
	public MeasurementItem(Date date, String comments, Trainer trainer, Customer customer) {
		setDate(date);
		setComments(comments);
		setTrainer(trainer);
		setCustomer(customer);
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
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
	
	public void addMeasurementItemLine(MeasurementItemLine measurementItemLine) {
		measurementItemLines.add(measurementItemLine);
		measurementItemLine.setMeasurementItem(this);
	}
	
	public void removeMeasurementItemLine(MeasurementItemLine measurementItemLine) {
		measurementItemLines.remove(measurementItemLine);
		measurementItemLine.setMeasurementItem(null);
	}
	
}
