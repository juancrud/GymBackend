package com.juancrud.gym.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.dao.Exercise;
import com.juancrud.gym.services.interfaces.IExerciseService;

@RestController
@RequestMapping("/exercises")
public class ExerciseController extends BaseController<Exercise, Integer, IExerciseService> {
	
	@Autowired
    private IExerciseService exerciseService;
	
	@GetMapping("/testNew")
	public Exercise testNew() {
		return exerciseService.save(new Exercise("test name", "test description", null));
	}
}
