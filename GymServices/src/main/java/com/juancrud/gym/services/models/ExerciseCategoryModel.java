package com.juancrud.gym.services.models;

public class ExerciseCategoryModel extends EntityModel<Integer> {
	
	private String name;
	
	public ExerciseCategoryModel() {
	}
	
	public ExerciseCategoryModel(Integer id, String name) {
		setId(id);
		setName(name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
