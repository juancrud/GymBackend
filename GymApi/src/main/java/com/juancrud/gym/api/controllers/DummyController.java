package com.juancrud.gym.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.services.interfaces.IDummyService;
import com.juancrud.gym.services.models.DummyModel;

@RestController
@RequestMapping("/dummies")
public class DummyController extends BaseController<DummyModel, Integer> {

	@Autowired
    private IDummyService dummyService;
	
	@GetMapping("/testNew")
	public DummyModel testNew() {
		return dummyService.create(new DummyModel(null, "Test Name", "Test Description"));
	}
}
