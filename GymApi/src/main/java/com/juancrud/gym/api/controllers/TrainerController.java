package com.juancrud.gym.api.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.dao.Person;
import com.juancrud.gym.dao.Trainer;
import com.juancrud.gym.dao.enums.GenderEnum;
import com.juancrud.gym.dao.enums.TrainerStatusEnum;
import com.juancrud.gym.services.interfaces.ITrainerService;

@RestController
@RequestMapping("/trainers")
public class TrainerController extends BaseController<Trainer, Integer> {

	@Autowired
    private ITrainerService trainerService;
	
	@GetMapping("/testNew")
	public Trainer testNew() {
		Person person = new Person(112040765, "Gabriela Sanchez", GenderEnum.Female, new Date(1984, 4, 9), null, null, 0);
		return trainerService.save(new Trainer(person, TrainerStatusEnum.Inactive));
	}
	
}
