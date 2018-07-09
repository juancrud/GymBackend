package com.juancrud.gym.services;

import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Media;
import com.juancrud.gym.services.interfaces.IMediaService;
import com.juancrud.gym.services.models.MediaModel;

@Service
public class MediaService extends BaseService<MediaModel, Media, Integer> implements IMediaService {

}
