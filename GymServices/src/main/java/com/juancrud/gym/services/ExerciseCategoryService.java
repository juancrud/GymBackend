package com.juancrud.gym.services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.ExerciseCategory;
import com.juancrud.gym.repositories.ExerciseCategoryRepository;

@Service
public class ExerciseCategoryService implements IExerciseCategoryService {

	@Autowired
	private ExerciseCategoryRepository exerciseCategoryRepository;

	public Collection<ExerciseCategory> getAll() {
		Iterable<ExerciseCategory> iterable = exerciseCategoryRepository.findAll();
		
		Collection<ExerciseCategory> result = new ArrayList<ExerciseCategory>();
		iterable.forEach(result::add);
		return result;
	}

	public ExerciseCategory get(int id) {
		return exerciseCategoryRepository.findById(id).get();
	}

	public ExerciseCategory save(ExerciseCategory exercise) {
		return exerciseCategoryRepository.save(exercise);
	}
	
}
