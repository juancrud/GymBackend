package com.juancrud.gym.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.services.models.MeasurementItemModel;

@RestController
@RequestMapping("/measurementItems")
public class MeasurementItemController extends BaseController<MeasurementItemModel, Integer> {
	
}
