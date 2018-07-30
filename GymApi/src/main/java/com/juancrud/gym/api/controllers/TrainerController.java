package com.juancrud.gym.api.controllers;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.dao.enums.GenderEnum;
import com.juancrud.gym.dao.enums.TrainerStatusEnum;
import com.juancrud.gym.services.interfaces.ITrainerService;
import com.juancrud.gym.services.models.TrainerModel;

@RestController
@RequestMapping("/trainers")
public class TrainerController extends BaseController<TrainerModel, Integer> {

	@Autowired
    private ITrainerService trainerService;
	
	@GetMapping("/testNew")
	public TrainerModel testNew() {
		TrainerModel model = new TrainerModel(null, 112040765, "Gabriela Sanchez", GenderEnum.Female, new Timestamp(84, 4, 9, 0, 0, 0, 0), null, null, 0, TrainerStatusEnum.Inactive);
		return trainerService.create(model);
	}
	
}
