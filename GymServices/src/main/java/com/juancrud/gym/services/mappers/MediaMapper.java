package com.juancrud.gym.services.mappers;

import org.springframework.stereotype.Component;

import com.juancrud.gym.dao.Media;
import com.juancrud.gym.services.models.MediaModel;

@Component
public class MediaMapper implements IModelEntityMapper<MediaModel, Media> {

	public MediaModel mapEntityToModel(Media media) {
		MediaModel mediaModel = new MediaModel();
		mediaModel.setId(media.getId());
		mediaModel.setUrl(media.getUrl());
		mediaModel.setType(media.getType());
		
		return mediaModel;
	}

	public Media mapModelToEntity(MediaModel mediaModel) {
		Media media = new Media();
		media.setId(mediaModel.getId());
		media.setUrl(mediaModel.getUrl());
		media.setType(mediaModel.getType());
		
		return media;
	}

}
