package com.juancrud.gym.services.models;

import java.util.Date;

public class MeasurementItemModel {

	private Integer id;
	private Date date;
	private String comments;
	private TrainerModel trainer;
	private CustomerModel customer;
	
	public MeasurementItemModel() {
	}
	
	public MeasurementItemModel(Integer id, Date date, String comments, TrainerModel trainer, CustomerModel customer) {
		setId(id);
		setDate(date);
		setComments(comments);
		setTrainer(trainer);
		setCustomer(customer);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
