package com.juancrud.gym.services;

import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Measurement;
import com.juancrud.gym.services.interfaces.IMeasurementService;
import com.juancrud.gym.services.models.MeasurementModel;

@Service
public class MeasurementService extends BaseService<MeasurementModel, Measurement, Integer> implements IMeasurementService {
	
}
