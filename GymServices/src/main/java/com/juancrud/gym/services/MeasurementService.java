package com.juancrud.gym.services;

import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Measurement;
import com.juancrud.gym.services.interfaces.IMeasurementService;

@Service
public class MeasurementService extends BaseService<Measurement, Integer> implements IMeasurementService {
	
}
