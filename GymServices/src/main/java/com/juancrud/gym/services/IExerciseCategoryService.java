package com.juancrud.gym.services;

import java.util.Collection;

import com.juancrud.gym.dao.ExerciseCategory;

public interface IExerciseCategoryService {
	Collection<ExerciseCategory> getAll();
	ExerciseCategory get(int id);
	ExerciseCategory save(ExerciseCategory exercise);
}
