package com.juancrud.gym.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.services.models.MeasurementModel;

@RestController
@RequestMapping("/measurements")
public class MeasurementController extends BaseController<MeasurementModel, Integer> {
	
}
