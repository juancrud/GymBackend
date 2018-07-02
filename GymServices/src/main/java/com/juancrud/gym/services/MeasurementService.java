package com.juancrud.gym.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Measurement;

@Service
public class MeasurementService extends BaseService<Measurement, Integer, CrudRepository<Measurement, Integer>> implements IMeasurementService {
	
}