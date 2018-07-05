package com.juancrud.gym.services;

import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Trainer;
import com.juancrud.gym.services.interfaces.ITrainerService;

@Service
public class TrainerService extends BaseService<Trainer, Integer> implements ITrainerService {
	
}
