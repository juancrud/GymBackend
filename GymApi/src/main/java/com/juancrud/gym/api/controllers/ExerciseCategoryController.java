package com.juancrud.gym.api.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.dao.ExerciseCategory;
import com.juancrud.gym.services.IExerciseCategoryService;

@RestController
@RequestMapping("/exerciseCategories")
public class ExerciseCategoryController {

	@Autowired
    private IExerciseCategoryService exerciseCategoryService;
	
	@GetMapping("/")
	public Collection<ExerciseCategory> getAll() {
		return exerciseCategoryService.getAll();
	}
	
	@GetMapping("/{id}")
	public ExerciseCategory get(@PathVariable int id) {
		return exerciseCategoryService.get(id);
	}
	
	@PostMapping("/")
	public ExerciseCategory save(@RequestBody ExerciseCategory exercise) {
		return exerciseCategoryService.save(exercise);
	}
	
	@GetMapping("/testNew")
	public ExerciseCategory testNew() {
		return exerciseCategoryService.save(new ExerciseCategory("Test Category"));
	}
	
	@GetMapping("/test")
	public String test() {
		return "Hello World from controller";
	}
	
}
