package com.juancrud.gym.dao;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.juancrud.gym.dao.enums.MediaTypeEnum;

@Entity
public class Media extends EntityWithId {

	@Column (name = "Url", nullable = false)
	private String url;
	
	@Column (name = "Type", nullable = false)
	private MediaTypeEnum type;
	
	public Media() {
	}
	
	public Media(String url, MediaTypeEnum type) {
		setUrl(url);
		setType(type);
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
