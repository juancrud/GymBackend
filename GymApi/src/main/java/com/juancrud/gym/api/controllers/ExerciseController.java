package com.juancrud.gym.api.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.services.interfaces.IExerciseCategoryService;
import com.juancrud.gym.services.interfaces.IExerciseService;
import com.juancrud.gym.services.models.ExerciseCategoryModel;
import com.juancrud.gym.services.models.ExerciseModel;

@RestController
@RequestMapping("/exercises")
public class ExerciseController extends BaseController<ExerciseModel, Integer> {
	
	@Autowired
    private IExerciseService exerciseService;
	
	@Autowired
	private IExerciseCategoryService exerciseCategoryService;
	
	@GetMapping("/testNew")
	public ExerciseModel testNew() {
		Collection<ExerciseCategoryModel> exerciseCategoryModels = exerciseCategoryService.getAll();
		ExerciseCategoryModel exerciseCategoryModel = null;
		for(ExerciseCategoryModel ecm : exerciseCategoryModels) {
			exerciseCategoryModel = ecm;
		}
		
		return exerciseService.save(new ExerciseModel(null, "test name", "test description", exerciseCategoryModel));
	}
}
