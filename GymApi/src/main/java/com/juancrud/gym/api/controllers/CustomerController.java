package com.juancrud.gym.api.controllers;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.dao.enums.CustomerStatusEnum;
import com.juancrud.gym.dao.enums.GenderEnum;
import com.juancrud.gym.services.interfaces.ICustomerService;
import com.juancrud.gym.services.models.CustomerModel;

@RestController
@RequestMapping("/customers")
public class CustomerController extends BaseController<CustomerModel, Integer> {

	@Autowired
    private ICustomerService customerService;
	
	@GetMapping("/testNew")
	public CustomerModel testNew() {
		CustomerModel model = new CustomerModel(null, 901120925, "Juan Carlos Rudin", GenderEnum.Male, new Timestamp(84, 8, 26, 0, 0, 0, 0), null, null, 0, 172, CustomerStatusEnum.Active);
		return customerService.create(model);
	}
	
}
