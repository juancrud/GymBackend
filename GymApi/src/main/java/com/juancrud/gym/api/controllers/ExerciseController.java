package com.juancrud.gym.api.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.dao.Exercise;
import com.juancrud.gym.dao.ExerciseCategory;
import com.juancrud.gym.services.interfaces.IExerciseCategoryService;
import com.juancrud.gym.services.interfaces.IExerciseService;

@RestController
@RequestMapping("/exercises")
public class ExerciseController extends BaseController<Exercise, Integer> {
	
	@Autowired
    private IExerciseService exerciseService;
	
	@Autowired
	private IExerciseCategoryService exerciseCategoryService;
	
	@GetMapping("/testNew")
	public Exercise testNew() {
		Collection<ExerciseCategory> exerciseCategories = exerciseCategoryService.getAll();
		ExerciseCategory exerciseCategory = null;
		for(ExerciseCategory ec : exerciseCategories) {
			exerciseCategory = ec;
		}
		
		return exerciseService.save(new Exercise("test name", "test description", exerciseCategory));
	}
}
