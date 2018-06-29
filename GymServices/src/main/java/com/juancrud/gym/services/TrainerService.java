package com.juancrud.gym.services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Trainer;
import com.juancrud.gym.repositories.TrainerRepository;

@Service
public class TrainerService implements ITrainerService {
	
	@Autowired
	private TrainerRepository trainerRepository;

	public Collection<Trainer> getAll() {
		Iterable<Trainer> iterable = trainerRepository.findAll();
		
		Collection<Trainer> result = new ArrayList<Trainer>();
		iterable.forEach(result::add);
		return result;
	}

	public Trainer get(int id) {
		return trainerRepository.findById(id).get();
	}

	public Trainer save(Trainer trainer) {
		return trainerRepository.save(trainer);
	}
}
