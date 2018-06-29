package com.juancrud.gym.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Exercise extends EntityWithId {
	
	@Column (name = "Name")
	private String name;
	
	@Column (name = "Description")
	private String description;
	
	@ManyToOne
    @JoinColumn(name="exerciseCategoryId", nullable=true)
	private ExerciseCategory exerciseCategory;
	
	//private IList<ExerciseMedia> ExerciseMedias { get; set; }
	
	public Exercise() {
	}
	
	public Exercise(String name, String description) {
		setName(name);
		setDescription(description);
	}
	
	public Exercise(String name, String description, ExerciseCategory exerciseCategory) {
		this(name, description);
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

	public ExerciseCategory getExerciseCategory() {
		return exerciseCategory;
	}

	public void setExerciseCategory(ExerciseCategory exerciseCategory) {
		this.exerciseCategory = exerciseCategory;
	}
}
