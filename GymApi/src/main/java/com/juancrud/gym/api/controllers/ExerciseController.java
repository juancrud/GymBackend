package com.juancrud.gym.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.services.models.ExerciseModel;

@RestController
@RequestMapping("/exercises")
public class ExerciseController extends BaseController<ExerciseModel, Integer> {
	
}
