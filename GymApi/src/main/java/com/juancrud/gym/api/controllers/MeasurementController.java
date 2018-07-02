package com.juancrud.gym.api.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.dao.Measurement;
import com.juancrud.gym.services.interfaces.IMeasurementService;

@RestController
@RequestMapping("/measurements")
public class MeasurementController {

	@Autowired
    private IMeasurementService measurementService;
	
	@GetMapping("/")
	public Collection<Measurement> getAll() {
		return measurementService.getAll();
	}
	
	@GetMapping("/{id}")
	public Measurement get(@PathVariable int id) {
		return measurementService.get(id);
	}
	
	@PostMapping("/")
	public Measurement save(@RequestBody Measurement measurement) {
		return measurementService.save(measurement);
	}
	
	@GetMapping("/testNew")
	public Measurement testNew() {
		return measurementService.save(new Measurement("Test Name", "Test description"));
	}
}
