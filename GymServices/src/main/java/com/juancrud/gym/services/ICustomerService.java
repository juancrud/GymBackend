package com.juancrud.gym.services;

import java.util.Collection;

import com.juancrud.gym.dao.Customer;

public interface ICustomerService {
	Collection<Customer> getAll();
	Customer get(int id);
	Customer save(Customer customer);
}
