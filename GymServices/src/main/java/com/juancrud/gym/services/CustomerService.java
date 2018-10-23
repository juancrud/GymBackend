package com.juancrud.gym.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Customer;
import com.juancrud.gym.repositories.CustomerRepository;
import com.juancrud.gym.services.exceptions.GymServiceException;
import com.juancrud.gym.services.interfaces.ICustomerService;
import com.juancrud.gym.services.mappers.CustomerMapper;
import com.juancrud.gym.services.models.CustomerModel;

@Service
public class CustomerService extends BaseService<CustomerModel, Customer, Integer> implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerMapper customerMapper;
	
	public CustomerModel getByEmailAddress(String emailAddress) {
		Optional<Customer> response = customerRepository.getByPersonEmailAddress(emailAddress);
		if (!response.isPresent()) throw new GymServiceException("Customer not found (emailAddress: " + emailAddress + ").");
		
		return customerMapper.mapEntityToModel(response.get());
	}

}
