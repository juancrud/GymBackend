package com.juancrud.gym.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Exercise;
import com.juancrud.gym.services.interfaces.IExerciseService;

@Service
public class ExerciseService extends BaseService<Exercise, Integer, CrudRepository<Exercise, Integer>> implements IExerciseService {
	
}
