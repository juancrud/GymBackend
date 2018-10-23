package com.juancrud.gym.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Trainer;
import com.juancrud.gym.repositories.TrainerRepository;
import com.juancrud.gym.services.exceptions.GymServiceException;
import com.juancrud.gym.services.interfaces.ITrainerService;
import com.juancrud.gym.services.mappers.TrainerMapper;
import com.juancrud.gym.services.models.TrainerModel;

@Service
public class TrainerService extends BaseService<TrainerModel, Trainer, Integer> implements ITrainerService {
	
	@Autowired
	private TrainerRepository trainerRepository;
	
	@Autowired
	private TrainerMapper trainerMapper;
	
	public TrainerModel getByEmailAddress(String emailAddress) {
		Optional<Trainer> response = trainerRepository.getByPersonEmailAddress(emailAddress);
		if (!response.isPresent()) throw new GymServiceException("Trainer not found (emailAddress: " + emailAddress + ").");
		
		return trainerMapper.mapEntityToModel(response.get());
	}
}
