package com.juancrud.gym.api.controllers;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.dao.Customer;
import com.juancrud.gym.dao.MeasurementItem;
import com.juancrud.gym.dao.Trainer;
import com.juancrud.gym.services.interfaces.ICustomerService;
import com.juancrud.gym.services.interfaces.IMeasurementItemService;
import com.juancrud.gym.services.interfaces.ITrainerService;

@RestController
@RequestMapping("/measurementItems")
public class MeasurementItemController extends BaseController<MeasurementItem, Integer, IMeasurementItemService> {

	@Autowired
    private IMeasurementItemService measurementItemService;
	
	@Autowired
	private ITrainerService trainerService;
	
	@Autowired
	private ICustomerService customerService;
	
	@GetMapping("/testNew")
	public MeasurementItem testNew() {
		Collection<Trainer> trainers = trainerService.getAll();
		Trainer trainer = null;
		for(Trainer t : trainers) {
			trainer = t;
		}
		
		Collection<Customer> customers = customerService.getAll();
		Customer customer = null;
		for(Customer c : customers) {
			customer = c;
		}
		
		return measurementItemService.save(new MeasurementItem(new Date(), "Test comment", trainer, customer, null));
	}
}
