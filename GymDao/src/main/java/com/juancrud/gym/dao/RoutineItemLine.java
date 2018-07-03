package com.juancrud.gym.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class RoutineItemLine extends EntityWithId {
	
	@Column(name="Series")
	private Integer series;
	
	@Column(name="Repetitions")
	private Integer repetitions;
	
	@Column(name="RestTime")
	private Integer restTime;
	
	@Column(name="Weight")
	private Integer weight;
	
	@Column(name="Duration")
	private Integer duration;
	
	@Column(name="Comments")
	private String comments;
	
	@OneToOne
	@JoinColumn(name = "ExerciseId")
	private Exercise exercise;
	
	@ManyToOne
	@JoinColumn(name = "RoutineItemId")
	private RoutineItem routineItem;
	
	public RoutineItemLine() {
	}
	
	public RoutineItemLine(Exercise exercise, Integer series, Integer repetitions, Integer restTime, Integer weight, Integer duration, String comments) {
		setExercise(exercise);
		setSeries(series);
		setRepetitions(repetitions);
		setRestTime(restTime);
		setWeight(weight);
		setDuration(duration);
		setComments(comments);
	}

	public Integer getSeries() {
		return series;
	}

	public void setSeries(Integer series) {
		this.series = series;
	}

	public Integer getRepetitions() {
		return repetitions;
	}

	public void setRepetitions(Integer repetitions) {
		this.repetitions = repetitions;
	}

	public Integer getRestTime() {
		return restTime;
	}

	public void setRestTime(Integer restTime) {
		this.restTime = restTime;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Exercise getExercise() {
		return exercise;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}

	public RoutineItem getRoutineItem() {
		return routineItem;
	}

	public void setRoutineItem(RoutineItem routineItem) {
		this.routineItem = routineItem;
	}

}
