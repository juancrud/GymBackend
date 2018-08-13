package com.juancrud.gym.services.models;

import com.juancrud.gym.dao.enums.ExerciseStatusEnum;

public class ExerciseModel extends EntityModel<Integer> {
	
	private String name;
	private String description;
	private ExerciseStatusEnum status;
	private ExerciseCategoryModel exerciseCategory;
	
	public ExerciseModel() {
	}
	
	public ExerciseModel(Integer id, String name, String description, ExerciseStatusEnum status, ExerciseCategoryModel exerciseCategory) {
		setId(id);
		setName(name);
		setDescription(description);
		setStatus(status);
		setExerciseCategory(exerciseCategory);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public ExerciseStatusEnum getStatus() {
		return status;
	}

	public void setStatus(ExerciseStatusEnum status) {
		this.status = status;
	}

	public ExerciseCategoryModel getExerciseCategory() {
		return exerciseCategory;
	}

	public void setExerciseCategory(ExerciseCategoryModel exerciseCategory) {
		this.exerciseCategory = exerciseCategory;
	}
}
