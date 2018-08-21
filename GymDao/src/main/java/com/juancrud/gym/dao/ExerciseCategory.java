package com.juancrud.gym.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.juancrud.gym.dao.enums.ExerciseCategoryStatusEnum;

@Entity
public class ExerciseCategory extends EntityWithIdAndImage {
	
	@Column (name = "Name")
	private String name;
	
	@Column (name = "Description")
	private String description;
	
	@Column (name = "Status")
	private ExerciseCategoryStatusEnum status;
	
	@OneToMany(mappedBy="exerciseCategory")
	private Set<Exercise> exercises;
	
	public ExerciseCategory() {
		setExercises(new HashSet<Exercise>());
	}
	
	public ExerciseCategory(String name, String description, ExerciseCategoryStatusEnum status) {
		this();
		setName(name);
		setDescription(description);
		setStatus(status);
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
	
	public ExerciseCategoryStatusEnum getStatus() {
		return status;
	}

	public void setStatus(ExerciseCategoryStatusEnum status) {
		this.status = status;
	}

	public Set<Exercise> getExercises() {
		return exercises;
	}

	public void setExercises(Set<Exercise> exercises) {
		this.exercises = exercises;
	}
}
