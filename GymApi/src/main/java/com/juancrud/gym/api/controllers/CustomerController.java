package com.juancrud.gym.api.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.dao.Customer;
import com.juancrud.gym.dao.CustomerStatusEnum;
import com.juancrud.gym.services.ICustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
    private ICustomerService customerService;
	
	@GetMapping("/")
	public Collection<Customer> getAll() {
		return customerService.getAll();
	}
	
	@GetMapping("/{id}")
	public Customer get(@PathVariable int id) {
		return customerService.get(id);
	}
	
	@PostMapping("/")
	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer);
	}
	
	@GetMapping("/testNew")
	public Customer testNew() {
		return customerService.save(new Customer(CustomerStatusEnum.Active));
	}
	
}
