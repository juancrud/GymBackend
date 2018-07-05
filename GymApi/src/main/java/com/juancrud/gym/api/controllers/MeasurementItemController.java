package com.juancrud.gym.api.controllers;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.services.interfaces.ICustomerService;
import com.juancrud.gym.services.interfaces.IMeasurementItemService;
import com.juancrud.gym.services.interfaces.ITrainerService;
import com.juancrud.gym.services.models.CustomerModel;
import com.juancrud.gym.services.models.MeasurementItemModel;
import com.juancrud.gym.services.models.TrainerModel;

@RestController
@RequestMapping("/measurementItems")
public class MeasurementItemController extends BaseController<MeasurementItemModel, Integer> {

	@Autowired
    private IMeasurementItemService measurementItemService;
	
	@Autowired
	private ITrainerService trainerService;
	
	@Autowired
	private ICustomerService customerService;
	
	@GetMapping("/testNew")
	public MeasurementItemModel testNew() {
		Collection<TrainerModel> trainerModels = trainerService.getAll();
		TrainerModel trainerModel = null;
		for(TrainerModel tm : trainerModels) {
			trainerModel = tm;
		}
		
		Collection<CustomerModel> customerModels = customerService.getAll();
		CustomerModel customerModel = null;
		for(CustomerModel cm : customerModels) {
			customerModel = cm;
		}
		
		return measurementItemService.save(new MeasurementItemModel(null, new Date(), "Test comment", trainerModel, customerModel));
	}
}
