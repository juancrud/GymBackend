package com.juancrud.gym.services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Exercise;
import com.juancrud.gym.repositories.ExerciseRepository;

@Service
public class ExerciseService implements IExerciseService {
	
	@Autowired
	private ExerciseRepository exerciseRepository;

	public Collection<Exercise> getAll() {
		Iterable<Exercise> iterable = exerciseRepository.findAll();
		
		Collection<Exercise> result = new ArrayList<Exercise>();
		iterable.forEach(result::add);
		return result;
	}

	public Exercise get(int id) {
		return exerciseRepository.findById(id).get();
	}

	public Exercise save(Exercise exercise) {
		return exerciseRepository.save(exercise);
	}
	
	
	
	
	public String test() {
		return "Hello World from service!";
	}
}
