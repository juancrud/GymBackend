package com.juancrud.gym.services.mappers;

import org.springframework.stereotype.Component;

import com.juancrud.gym.dao.Customer;
import com.juancrud.gym.dao.Person;
import com.juancrud.gym.services.models.CustomerModel;

@Component
public class CustomerMapper implements IModelEntityMapper<CustomerModel, Customer> {

	public CustomerModel mapEntityToModel(Customer customer) {
		CustomerModel customerModel = new CustomerModel();
		customerModel.setId(customer.getId());
		customerModel.setDocumentId(customer.getPerson().getDocumentId());
		customerModel.setName(customer.getPerson().getName());
		customerModel.setGender(customer.getPerson().getGender());
		customerModel.setBirthDay(customer.getPerson().getBirthDay());
		customerModel.setAddress(customer.getPerson().getAddress());
		customerModel.setEmailAddress(customer.getPerson().getEmailAddress());
		customerModel.setPhoneNumber(customer.getPerson().getPhoneNumber());
		customerModel.setHeight(customer.getHeight());
		customerModel.setStatus(customer.getStatus());
		
		if (customer.getPerson().getImage() != null) {
			customerModel.setImageUrl(customer.getPerson().getImage().getUrl());
		}
		
		return customerModel;
	}

	public Customer mapModelToEntity(CustomerModel customerModel) {
		Person person = new Person();
		person.setDocumentId(customerModel.getDocumentId());
		person.setName(customerModel.getName());
		person.setGender(customerModel.getGender());
		person.setBirthDay(customerModel.getBirthDay());
		person.setAddress(customerModel.getAddress());
		person.setEmailAddress(customerModel.getEmailAddress());
		person.setPhoneNumber(customerModel.getPhoneNumber());
		
		Customer customer = new Customer();
		customer.setId(customerModel.getId());
		customer.setHeight(customerModel.getHeight());
		customer.setStatus(customerModel.getStatus());
		customer.setPerson(person);
		
		return customer;
	}

}
