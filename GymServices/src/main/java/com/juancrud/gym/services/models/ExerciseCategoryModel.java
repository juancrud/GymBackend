package com.juancrud.gym.services.models;

public class ExerciseCategoryModel {
	
	private Integer id;
	private String name;
	
	public ExerciseCategoryModel() {
	}
	
	public ExerciseCategoryModel(Integer id, String name) {
		setId(id);
		setName(name);
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
