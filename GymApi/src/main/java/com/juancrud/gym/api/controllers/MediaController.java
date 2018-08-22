package com.juancrud.gym.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.services.models.MediaModel;

@RestController
@RequestMapping("/medias")
public class MediaController extends BaseController<MediaModel, Integer> {
	
}
