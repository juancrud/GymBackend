package com.juancrud.gym.services;

import org.springframework.stereotype.Service;

@Service
public class ExerciseService implements IExerciseService {
	public String test() {
		return "Hello World from service!";
	}
}
