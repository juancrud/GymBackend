package com.juancrud.gym.services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Customer;
import com.juancrud.gym.repositories.CustomerRepository;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Collection<Customer> getAll() {
		Iterable<Customer> iterable = customerRepository.findAll();
		
		Collection<Customer> result = new ArrayList<Customer>();
		iterable.forEach(result::add);
		return result;
	}

	public Customer get(int id) {
		return customerRepository.findById(id).get();
	}

	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

}
