package com.juancrud.gym.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class ExerciseCategory extends EntityWithId {
	
	@Column (name = "Name")
	private String name;
	
	@OneToMany(mappedBy="exerciseCategory")
	private Set<Exercise> exercises;
	
	public ExerciseCategory() {
		setExercises(new HashSet<Exercise>());
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

	public Set<Exercise> getExercises() {
		return exercises;
	}

	public void setExercises(Set<Exercise> exercises) {
		this.exercises = exercises;
	}
}
