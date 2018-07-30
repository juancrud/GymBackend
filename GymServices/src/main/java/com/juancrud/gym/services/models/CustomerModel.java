package com.juancrud.gym.services.models;

import java.sql.Timestamp;
import com.juancrud.gym.dao.enums.CustomerStatusEnum;
import com.juancrud.gym.dao.enums.GenderEnum;

public class CustomerModel extends EntityModel<Integer> {
	
	private int documentId;
	private String name;
	private GenderEnum gender;
	private Timestamp birthDay;
	private String address;
	private String emailAddress;
	private int phoneNumber;
	private int height;
	private CustomerStatusEnum status;
	
	public CustomerModel() {
	}
	
	public CustomerModel(Integer id, int documentId, String name, GenderEnum gender, Timestamp birthDay, String address, String emailAddress, int phoneNumber, int height, CustomerStatusEnum status) {
		setId(id);
		setDocumentId(documentId);
		setName(name);
		setGender(gender);
		setBirthDay(birthDay);
		setAddress(emailAddress);
		setEmailAddress(emailAddress);
		setPhoneNumber(phoneNumber);
		setHeight(height);
		setStatus(status);
	}
	
	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GenderEnum getGender() {
		return gender;
	}

	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}

	public Timestamp getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Timestamp birthDay) {
		this.birthDay = birthDay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
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

}
