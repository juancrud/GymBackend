package com.juancrud.gym.services.mappers;

import org.springframework.stereotype.Component;

import com.juancrud.gym.dao.Measurement;
import com.juancrud.gym.services.models.MeasurementModel;

@Component
public class MeasurementMapper implements IModelEntityMapper<MeasurementModel, Measurement> {

	public MeasurementModel mapEntityToModel(Measurement measurement) {
		MeasurementModel measurementModel = new MeasurementModel();
		measurementModel.setId(measurement.getId());
		measurementModel.setName(measurement.getName());
		measurementModel.setDescription(measurement.getDescription());
		measurementModel.setStatus(measurement.getStatus());
		
		if (measurement.getImage() != null) {
			measurementModel.setImageUrl(measurement.getImage().getUrl());
		}
		
		return measurementModel;
	}

	public Measurement mapModelToEntity(MeasurementModel measurementModel) {
		Measurement measurement = new Measurement();
		measurement.setId(measurementModel.getId());
		measurement.setName(measurementModel.getName());
		measurement.setDescription(measurementModel.getDescription());
		measurement.setStatus(measurementModel.getStatus());
		
		return measurement;
	}

}
