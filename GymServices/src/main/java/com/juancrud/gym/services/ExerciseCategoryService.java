package com.juancrud.gym.services;

import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.ExerciseCategory;
import com.juancrud.gym.services.interfaces.IExerciseCategoryService;

@Service
public class ExerciseCategoryService extends BaseService<ExerciseCategory, Integer> implements IExerciseCategoryService {
	
}
