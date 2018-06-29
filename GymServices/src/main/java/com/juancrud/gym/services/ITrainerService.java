package com.juancrud.gym.services;

import java.util.Collection;

import com.juancrud.gym.dao.Trainer;

public interface ITrainerService {
	Collection<Trainer> getAll();
	Trainer get(int id);
	Trainer save(Trainer trainer);
}
