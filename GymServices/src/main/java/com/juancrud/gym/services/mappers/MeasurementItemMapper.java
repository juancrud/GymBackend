package com.juancrud.gym.services.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.juancrud.gym.dao.Customer;
import com.juancrud.gym.dao.MeasurementItem;
import com.juancrud.gym.dao.Trainer;
import com.juancrud.gym.services.models.CustomerModel;
import com.juancrud.gym.services.models.MeasurementItemModel;
import com.juancrud.gym.services.models.TrainerModel;

@Component
public class MeasurementItemMapper implements IModelEntityMapper<MeasurementItemModel, MeasurementItem> {

	@Autowired
	private IModelEntityMapper<TrainerModel, Trainer> trainerMapper;
	
	@Autowired
	private IModelEntityMapper<CustomerModel, Customer> customerMapper;
	
	public MeasurementItemModel mapEntityToModel(MeasurementItem measurementItem) {
		MeasurementItemModel measurementItemModel = new MeasurementItemModel();
		measurementItemModel.setId(measurementItem.getId());
		measurementItemModel.setDate(measurementItem.getDate());
		measurementItemModel.setComments(measurementItem.getComments());
		measurementItemModel.setTrainer(trainerMapper.mapEntityToModel(measurementItem.getTrainer()));
		measurementItemModel.setCustomer(customerMapper.mapEntityToModel(measurementItem.getCustomer()));
		
		return measurementItemModel;
	}

	public MeasurementItem mapModelToEntity(MeasurementItemModel measurementItemModel) {
		MeasurementItem measurementItem = new MeasurementItem();
		measurementItem.setId(measurementItemModel.getId());
		measurementItem.setDate(measurementItemModel.getDate());
		measurementItem.setComments(measurementItemModel.getComments());
		measurementItem.setTrainer(trainerMapper.mapModelToEntity(measurementItemModel.getTrainer()));
		measurementItem.setCustomer(customerMapper.mapModelToEntity(measurementItemModel.getCustomer()));
		
		return measurementItem;
	}

}
