package com.juancrud.gym.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.dao.enums.MediaTypeEnum;
import com.juancrud.gym.services.interfaces.IMediaService;
import com.juancrud.gym.services.models.MediaModel;

@RestController
@RequestMapping("/medias")
public class MediaController extends BaseController<MediaModel, Integer> {

	@Autowired
    private IMediaService mediaService;
	
	@GetMapping("/testNew")
	public MediaModel testNew() {
		return mediaService.create(new MediaModel(null, "TestImage1.png", MediaTypeEnum.Image));
	}
}
