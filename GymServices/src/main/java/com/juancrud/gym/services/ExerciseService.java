package com.juancrud.gym.services;

import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Exercise;
import com.juancrud.gym.services.interfaces.IExerciseService;
import com.juancrud.gym.services.models.ExerciseModel;

@Service
public class ExerciseService extends BaseService<ExerciseModel, Exercise, Integer> implements IExerciseService {
	
}
