package com.juancrud.gym.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.services.interfaces.IExerciseCategoryService;
import com.juancrud.gym.services.models.ExerciseCategoryModel;

@RestController
@RequestMapping("/exerciseCategories")
public class ExerciseCategoryController extends BaseController<ExerciseCategoryModel, Integer> {

	@Autowired
    private IExerciseCategoryService exerciseCategoryService;
	
	@GetMapping("/testNew")
	public ExerciseCategoryModel testNew() {
		return exerciseCategoryService.save(new ExerciseCategoryModel(null, "Test Category"));
	}
	
}
