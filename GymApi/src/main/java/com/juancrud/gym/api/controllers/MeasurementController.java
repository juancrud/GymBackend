package com.juancrud.gym.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.services.interfaces.IMeasurementService;
import com.juancrud.gym.services.models.MeasurementModel;

@RestController
@RequestMapping("/measurements")
public class MeasurementController extends BaseController<MeasurementModel, Integer> {

	@Autowired
    private IMeasurementService measurementService;
	
	@GetMapping("/testNew")
	public MeasurementModel testNew() {
		return measurementService.create(new MeasurementModel(null, "Test Name", "Test description"));
	}
}
