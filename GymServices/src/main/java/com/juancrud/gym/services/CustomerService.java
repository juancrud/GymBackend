package com.juancrud.gym.services;

import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Customer;
import com.juancrud.gym.services.interfaces.ICustomerService;
import com.juancrud.gym.services.models.CustomerModel;

@Service
public class CustomerService extends BaseService<CustomerModel, Customer, Integer> implements ICustomerService {

}
