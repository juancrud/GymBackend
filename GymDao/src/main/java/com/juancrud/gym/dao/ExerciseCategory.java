package com.juancrud.gym.dao;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ExerciseCategory extends EntityWithId {
	
	@Column (name = "Name")
	private String name;
	
	//private List<Exercise> exercises;
	
	public ExerciseCategory() {
		//setExercises(new ArrayList<Exercise>());
	}
	
	public ExerciseCategory(String name) {
		this();
		setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public List<Exercise> getExercises() {
//		return exercises;
//	}
//
//	public void setExercises(List<Exercise> exercises) {
//		this.exercises = exercises;
//	}
}
