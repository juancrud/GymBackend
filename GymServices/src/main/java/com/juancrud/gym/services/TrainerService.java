package com.juancrud.gym.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Trainer;

@Service
public class TrainerService extends BaseService<Trainer, Integer, CrudRepository<Trainer, Integer>> implements ITrainerService {
	
}
