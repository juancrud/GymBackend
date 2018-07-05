package com.juancrud.gym.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.dao.ExerciseCategory;
import com.juancrud.gym.services.interfaces.IExerciseCategoryService;

@RestController
@RequestMapping("/exerciseCategories")
public class ExerciseCategoryController extends BaseController<ExerciseCategory, Integer> {

	@Autowired
    private IExerciseCategoryService exerciseCategoryService;
	
	@GetMapping("/testNew")
	public ExerciseCategory testNew() {
		return exerciseCategoryService.save(new ExerciseCategory("Test Category"));
	}
	
}
