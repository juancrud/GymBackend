package com.juancrud.gym.services;

import java.util.Collection;

import com.juancrud.gym.dao.Measurement;

public interface IMeasurementService {
	Collection<Measurement> getAll();
	Measurement get(int id);
	Measurement save(Measurement measurement);
}
