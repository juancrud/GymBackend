package com.juancrud.gym.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class RoutineItem extends EntityWithId {
	
	@Column(name="Comments", nullable = true)
	private String comments;
	
	@OneToMany(mappedBy="routineItem")
	private Set<RoutineItemLine> routineItemLines;
	
	public RoutineItem() {
		routineItemLines = new HashSet<RoutineItemLine>();
	}
	
	public RoutineItem(String comments) {
		this();
		setComments(comments);
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public void addRoutineItemLine(RoutineItemLine routineItemLine) {
		routineItemLines.add(routineItemLine);
		routineItemLine.setRoutineItem(this);
	}
	
	public void removeRoutineItemLine(RoutineItemLine routineItemLine) {
		routineItemLines.remove(routineItemLine);
		routineItemLine.setRoutineItem(null);
	}
	
}
