package com.juancrud.gym.services.models;

import com.juancrud.gym.dao.enums.MediaTypeEnum;

public class MediaModel {

	private Integer id;
	private String url;
	private MediaTypeEnum type;
	
	public MediaModel() {
	}
	
	public MediaModel(Integer id, String url, MediaTypeEnum type) {
		setId(id);
		setUrl(url);
		setType(type);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public MediaTypeEnum getType() {
		return type;
	}

	public void setType(MediaTypeEnum type) {
		this.type = type;
	}
}
