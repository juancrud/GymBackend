package com.juancrud.gym.dao;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.juancrud.gym.dao.enums.GenderEnum;

@Entity
public class Person extends EntityWithId {

	@Column (name = "DocumentId")
	private int documentId;
	
	@Column (name = "Name")
	private String name;
	
	@Column (name = "Gender")
	private GenderEnum gender;
	
	@Column (name = "BirthDay")
	private Timestamp birthDay;
	
//	@Column (name = "Image")
//	private Object Image;
	
	@Column (name = "Address")
	private String address;
	
	@Column (name = "EmailAddress")
	private String emailAddress;
	
	@Column (name = "PhoneNumber")
	private int phoneNumber;
	
	public Person() {
	}
	
	public Person(int documentId, String name, GenderEnum gender, Timestamp birthDay, String address, String emailAddress, int phoneNumber) {
		setDocumentId(documentId);
		setName(name);
		setGender(gender);
		setBirthDay(birthDay);
		setAddress(emailAddress);
		setEmailAddress(emailAddress);
		setPhoneNumber(phoneNumber);
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
	
}
