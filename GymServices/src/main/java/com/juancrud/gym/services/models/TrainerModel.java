package com.juancrud.gym.services.models;

import java.util.Date;

import com.juancrud.gym.dao.enums.GenderEnum;
import com.juancrud.gym.dao.enums.TrainerStatusEnum;

public class TrainerModel {

	private String id;
	private int documentId;
	private String name;
	private GenderEnum gender;
	private Date birthDay;
	private String address;
	private String emailAddress;
	private int phoneNumber;
	private TrainerStatusEnum status;
	
	public TrainerModel(String id, int documentId, String name, GenderEnum gender, Date birthDay, String address, String emailAddress, int phoneNumber, TrainerStatusEnum status) {
		setId(id);
		setDocumentId(documentId);
		setName(name);
		setGender(gender);
		setBirthDay(birthDay);
		setAddress(address);
		setEmailAddress(emailAddress);
		setPhoneNumber(phoneNumber);
		setStatus(status);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
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

	public TrainerStatusEnum getStatus() {
		return status;
	}

	public void setStatus(TrainerStatusEnum status) {
		this.status = status;
	}
}