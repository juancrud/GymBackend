package com.juancrud.gym.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.services.models.ExerciseCategoryModel;

@RestController
@RequestMapping("/exerciseCategories")
public class ExerciseCategoryController extends BaseController<ExerciseCategoryModel, Integer> {
	
}
