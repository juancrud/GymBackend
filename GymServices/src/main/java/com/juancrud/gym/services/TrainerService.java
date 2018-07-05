package com.juancrud.gym.services;

import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Trainer;
import com.juancrud.gym.services.interfaces.ITrainerService;
import com.juancrud.gym.services.models.TrainerModel;

@Service
public class TrainerService extends BaseService<TrainerModel, Trainer, Integer> implements ITrainerService {
	
}
