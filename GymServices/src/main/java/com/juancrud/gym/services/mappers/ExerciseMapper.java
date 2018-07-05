package com.juancrud.gym.services.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.juancrud.gym.dao.Exercise;
import com.juancrud.gym.dao.ExerciseCategory;
import com.juancrud.gym.services.models.ExerciseCategoryModel;
import com.juancrud.gym.services.models.ExerciseModel;

@Component
public class ExerciseMapper implements IModelEntityMapper<ExerciseModel, Exercise> {
	
	@Autowired
	private IModelEntityMapper<ExerciseCategoryModel, ExerciseCategory> exerciseCategoryMapper;

	public ExerciseModel mapEntityToModel(Exercise exercise) {
		ExerciseModel exerciseModel = new ExerciseModel();
		exerciseModel.setId(exercise.getId());
		exerciseModel.setName(exercise.getName());
		exerciseModel.setDescription(exercise.getDescription());
		exerciseModel.setExerciseCategory(exerciseCategoryMapper.mapEntityToModel(exercise.getExerciseCategory()));
		
		return exerciseModel;
	}

	public Exercise mapModelToEntity(ExerciseModel exerciseModel) {
		Exercise exercise = new Exercise();
		exercise.setId(exerciseModel.getId());
		exercise.setName(exerciseModel.getName());
		exercise.setDescription(exerciseModel.getDescription());
		exercise.setExerciseCategory(exerciseCategoryMapper.mapModelToEntity(exerciseModel.getExerciseCategory()));
		
		return exercise;
	}

}
