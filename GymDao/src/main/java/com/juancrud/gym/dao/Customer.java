package com.juancrud.gym.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer extends EntityWithId {
	
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name = "personId")
	private Person person;

	@Column (name = "Status")
	private CustomerStatusEnum status;
	
	public Customer() {
	}
	
	public Customer(Person person, CustomerStatusEnum status) {
		setPerson(person);
		setStatus(status);
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public CustomerStatusEnum getStatus() {
		return status;
	}

	public void setStatus(CustomerStatusEnum status) {
		this.status = status;
	}
	
}
