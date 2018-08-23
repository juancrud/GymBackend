package com.juancrud.gym.services.mappers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.juancrud.gym.dao.Exercise;
import com.juancrud.gym.dao.ExerciseCategory;
import com.juancrud.gym.services.models.ExerciseCategoryModel;
import com.juancrud.gym.services.models.ExerciseModel;

@Component
public class ExerciseCategoryMapper implements IModelEntityMapper<ExerciseCategoryModel, ExerciseCategory> {
	
	@Autowired
	private ExerciseMapper exerciseMapper;

	public ExerciseCategoryModel mapEntityToModel(ExerciseCategory exerciseCategory) {
		ExerciseCategoryModel exerciseCategoryModel = new ExerciseCategoryModel();
		exerciseCategoryModel.setId(exerciseCategory.getId());
		exerciseCategoryModel.setName(exerciseCategory.getName());
		exerciseCategoryModel.setDescription(exerciseCategory.getDescription());
		exerciseCategoryModel.setStatus(exerciseCategory.getStatus());
		
		if (exerciseCategory.getImage() != null) {
			exerciseCategoryModel.setImageUrl(exerciseCategory.getImage().getUrl());
		}
		
		List<ExerciseModel> exercises = new ArrayList<ExerciseModel>();
		for(Exercise exercise : exerciseCategory.getExercises()) {
			exercises.add(exerciseMapper.mapEntityToModel(exercise));
		}
		exerciseCategoryModel.setExercises(exercises);
		
		return exerciseCategoryModel;
	}

	public ExerciseCategory mapModelToEntity(ExerciseCategoryModel exerciseCategoryModel) {
		ExerciseCategory exerciseCategory = new ExerciseCategory();
		exerciseCategory.setId(exerciseCategoryModel.getId());
		exerciseCategory.setName(exerciseCategoryModel.getName());
		exerciseCategory.setDescription(exerciseCategoryModel.getDescription());
		exerciseCategory.setStatus(exerciseCategoryModel.getStatus());
		
		return exerciseCategory;
	}

}
