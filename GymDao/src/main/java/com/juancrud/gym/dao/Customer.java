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
public class Customer extends EntityWithId {
	
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name = "personId")
	private Person person;
	
	private int height;

	@Column (name = "Status")
	private CustomerStatusEnum status;
	
	@OneToMany(mappedBy="customer")
	private Set<MeasurementItem> measurementItems;
	
	public Customer() {
		measurementItems = new HashSet<MeasurementItem>();
	}
	
	public Customer(Person person, int height, CustomerStatusEnum status) {
		setPerson(person);
		setHeight(height);
		setStatus(status);
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public CustomerStatusEnum getStatus() {
		return status;
	}

	public void setStatus(CustomerStatusEnum status) {
		this.status = status;
	}
	
	public void addMeasurementItem(MeasurementItem measurementItem) {
		measurementItems.add(measurementItem);
		measurementItem.setCustomer(this);
	}
	
	public void removeMeasurementItem(MeasurementItem measurementItem) {
		measurementItems.remove(measurementItem);
		measurementItem.setCustomer(null);
	}
}
