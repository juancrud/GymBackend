package com.juancrud.gym.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.dao.Measurement;
import com.juancrud.gym.services.interfaces.IMeasurementService;

@RestController
@RequestMapping("/measurements")
public class MeasurementController extends BaseController<Measurement, Integer> {

	@Autowired
    private IMeasurementService measurementService;
	
	@GetMapping("/testNew")
	public Measurement testNew() {
		return measurementService.save(new Measurement("Test Name", "Test description"));
	}
}
