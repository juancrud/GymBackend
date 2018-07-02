package com.juancrud.gym.api.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.dao.Exercise;
import com.juancrud.gym.services.interfaces.IExerciseService;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {
	
	@Autowired
    private IExerciseService exerciseService;
	
	@GetMapping("/")
	public Collection<Exercise> getAll() {
		return exerciseService.getAll();
	}
	
	@GetMapping("/{id}")
	public Exercise get(@PathVariable int id) {
		return exerciseService.get(id);
	}
	
	@PostMapping("/")
	public Exercise save(@RequestBody Exercise exercise) {
		return exerciseService.save(exercise);
	}
	
	@GetMapping("/testNew")
	public Exercise testNew() {
		return exerciseService.save(new Exercise("test name", "test description", null));
	}
}
