package com.juancrud.gym.services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Measurement;
import com.juancrud.gym.repositories.MeasurementRepository;

@Service
public class MeasurementService implements IMeasurementService {
	
	@Autowired
	private MeasurementRepository measurementRepository;

	@Override
	public Collection<Measurement> getAll() {
		Iterable<Measurement> iterable = measurementRepository.findAll();
		
		Collection<Measurement> result = new ArrayList<Measurement>();
		iterable.forEach(result::add);
		return result;
	}

	@Override
	public Measurement get(int id) {
		return measurementRepository.findById(id).get();
	}

	@Override
	public Measurement save(Measurement measurement) {
		return measurementRepository.save(measurement);
	}

}
