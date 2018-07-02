package com.juancrud.gym.api.controllers;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
public class MeasurementItemController {

	@Autowired
    private IMeasurementItemService measurementItemService;
	
	@Autowired
	private ITrainerService trainerService;
	
	@Autowired
	private ICustomerService customerService;
	
	@GetMapping("/")
	public Collection<MeasurementItem> getAll() {
		return measurementItemService.getAll();
	}
	
	@GetMapping("/{id}")
	public MeasurementItem get(@PathVariable int id) {
		return measurementItemService.get(id);
	}
	
	@PostMapping("/")
	public MeasurementItem save(@RequestBody MeasurementItem exercise) {
		return measurementItemService.save(exercise);
	}
	
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
		
		return measurementItemService.save(new MeasurementItem(new Date(), "Test comment", trainer, customer));
	}
}
