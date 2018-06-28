package com.juancrud.gym.dao;

import javax.persistence.Column;

public class Exercise extends EntityWithId {
	
	@Column (name = "Name")
	private String name;
	
	@Column (name = "Description")
	private String description;
	
	
	//private ExerciseCategory ExerciseCategory;
	//private IList<ExerciseMedia> ExerciseMedias { get; set; }
	
	public Exercise() {
	}
	
	public Exercise(String name, String description, ExerciseCategory exerciseCategory) {
		setName(name);
		setDescription(description);
		//setExerciseCategory(exerciseCategory);
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
	
//	public ExerciseCategory getExerciseCategory() {
//		return ExerciseCategory;
//	}
//	
//	public void setExerciseCategory(ExerciseCategory exerciseCategory) {
//		ExerciseCategory = exerciseCategory;
//	}
}
