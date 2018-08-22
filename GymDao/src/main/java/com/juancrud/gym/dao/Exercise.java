package com.juancrud.gym.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.juancrud.gym.dao.enums.ExerciseStatusEnum;

@Entity
public class Exercise extends EntityWithIdAndImage {
	
	@Column (name = "Name", nullable = false)
	private String name;
	
	@Column (name = "Description", nullable = true)
	private String description;
	
	@Column (name = "Status", nullable = false)
	private ExerciseStatusEnum status;
	
	@ManyToOne
    @JoinColumn(name="exerciseCategoryId", nullable = true)
	private ExerciseCategory exerciseCategory;
	
	//private IList<ExerciseMedia> ExerciseMedias { get; set; }
	
	public Exercise() {
	}
	
	public Exercise(String name, String description, ExerciseStatusEnum status) {
		setName(name);
		setDescription(description);
		setStatus(status);
	}
	
	public Exercise(String name, String description, ExerciseStatusEnum status, ExerciseCategory exerciseCategory) {
		this(name, description, status);
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

	public ExerciseStatusEnum getStatus() {
		return status;
	}

	public void setStatus(ExerciseStatusEnum status) {
		this.status = status;
	}
}
