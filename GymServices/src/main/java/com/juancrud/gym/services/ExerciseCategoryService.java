package com.juancrud.gym.services;

import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.ExerciseCategory;
import com.juancrud.gym.services.interfaces.IExerciseCategoryService;
import com.juancrud.gym.services.models.ExerciseCategoryModel;

@Service
public class ExerciseCategoryService extends BaseService<ExerciseCategoryModel, ExerciseCategory, Integer> implements IExerciseCategoryService {
	
}
