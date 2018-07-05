package com.juancrud.gym.services.mappers;

import org.springframework.stereotype.Component;

import com.juancrud.gym.dao.Dummy;
import com.juancrud.gym.services.models.DummyModel;

@Component
public class DummyMapper implements IModelEntityMapper<DummyModel, Dummy> {

	public DummyModel mapEntityToModel(Dummy dummy) {
		DummyModel dummyModel = new DummyModel();
		dummyModel.setId(dummy.getId());
		dummyModel.setName(dummy.getName());
		dummyModel.setDescription(dummy.getDescription());
		
		return dummyModel;
	}
	
	public Dummy mapModelToEntity(DummyModel dummyModel) {
		Dummy dummy = new Dummy();
		dummy.setId(dummyModel.getId());
		dummy.setName(dummyModel.getName());
		dummy.setDescription(dummyModel.getDescription());
		
		return dummy;
	}
}
