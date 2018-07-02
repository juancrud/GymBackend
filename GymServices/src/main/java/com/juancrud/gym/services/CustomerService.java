package com.juancrud.gym.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Customer;
import com.juancrud.gym.services.interfaces.ICustomerService;

@Service
public class CustomerService extends BaseService<Customer, Integer, CrudRepository<Customer, Integer>> implements ICustomerService {

}
