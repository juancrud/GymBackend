package com.juancrud.gym.services.mappers;

import org.springframework.stereotype.Component;

import com.juancrud.gym.dao.ExerciseCategory;
import com.juancrud.gym.services.models.ExerciseCategoryModel;

@Component
public class ExerciseCategoryMapper implements IModelEntityMapper<ExerciseCategoryModel, ExerciseCategory> {

	public ExerciseCategoryModel mapEntityToModel(ExerciseCategory exerciseCategory) {
		ExerciseCategoryModel exerciseCategoryModel = new ExerciseCategoryModel();
		exerciseCategoryModel.setId(exerciseCategory.getId());
		exerciseCategoryModel.setName(exerciseCategory.getName());
		exerciseCategoryModel.setDescription(exerciseCategory.getDescription());
		exerciseCategoryModel.setStatus(exerciseCategory.getStatus());
		
		if (exerciseCategory.getImage() != null) {
			exerciseCategoryModel.setImageUrl(exerciseCategory.getImage().getUrl());
		}
		
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
