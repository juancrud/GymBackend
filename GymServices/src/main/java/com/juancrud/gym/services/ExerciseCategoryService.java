package com.juancrud.gym.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.ExerciseCategory;
import com.juancrud.gym.services.interfaces.IExerciseCategoryService;

@Service
public class ExerciseCategoryService extends BaseService<ExerciseCategory, Integer, CrudRepository<ExerciseCategory, Integer>> implements IExerciseCategoryService {
	
}
