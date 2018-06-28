package com.juancrud.gym.services;

import java.util.Collection;

import com.juancrud.gym.dao.Exercise;

public interface IExerciseService {
	Collection<Exercise> getAll();
	Exercise get(int id);
	Exercise save(Exercise exercise);
}
