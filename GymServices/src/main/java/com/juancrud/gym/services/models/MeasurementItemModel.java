package com.juancrud.gym.services.models;

import java.sql.Timestamp;

public class MeasurementItemModel extends EntityModel<Integer> {

	private Timestamp date;
	private String comments;
	private TrainerModel trainer;
	private CustomerModel customer;
	
	public MeasurementItemModel() {
	}
	
	public MeasurementItemModel(Integer id, Timestamp date, String comments, TrainerModel trainer, CustomerModel customer) {
		setId(id);
		setDate(date);
		setComments(comments);
		setTrainer(trainer);
		setCustomer(customer);
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

	public TrainerModel getTrainer() {
		return trainer;
	}

	public void setTrainer(TrainerModel trainer) {
		this.trainer = trainer;
	}

	public CustomerModel getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
	}
	
}
