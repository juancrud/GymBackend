package com.juancrud.gym.services.models;

import com.juancrud.gym.dao.enums.ExerciseCategoryStatusEnum;

public class ExerciseCategoryModel extends EntityModel<Integer> {
	
	private String name;
	private String description;
	private ExerciseCategoryStatusEnum status;
	private String imageUrl;
	
	public ExerciseCategoryModel() {
	}
	
	public ExerciseCategoryModel(Integer id, String name, String description, ExerciseCategoryStatusEnum status) {
		setId(id);
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

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
