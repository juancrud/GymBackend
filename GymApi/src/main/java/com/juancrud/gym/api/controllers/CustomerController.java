package com.juancrud.gym.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.services.models.CustomerModel;

@RestController
@RequestMapping("/customers")
public class CustomerController extends BaseController<CustomerModel, Integer> {
	
}
