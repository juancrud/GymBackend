package com.juancrud.gym.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.services.IExerciseService;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {
	
	@Autowired
    //private IExerciseService exerciseService;
	
	@GetMapping("/test")
	public String test() {
//		return exerciseService.test();
		return "Hello World from controller";
	}
}
