package com.juancrud.gym.services.models;

public class ExerciseModel extends EntityModel<Integer> {
	
	private String name;
	private String description;
	private ExerciseCategoryModel exerciseCategory;
	
	public ExerciseModel() {
	}
	
	public ExerciseModel(Integer id, String name, String description, ExerciseCategoryModel exerciseCategory) {
		setId(id);
		setName(name);
		setDescription(description);
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

	public ExerciseCategoryModel getExerciseCategory() {
		return exerciseCategory;
	}

	public void setExerciseCategory(ExerciseCategoryModel exerciseCategory) {
		this.exerciseCategory = exerciseCategory;
	}
}
