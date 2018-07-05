package com.juancrud.gym.services.mappers;

import org.springframework.stereotype.Component;

import com.juancrud.gym.dao.Dummy;
import com.juancrud.gym.services.models.DummyModel;

@Component
public class DummyMapper implements IModelEntityMapper<DummyModel, Dummy> {

	public DummyModel mapEntityToModel(Dummy dummy) {
		return new DummyModel(dummy.getId(), dummy.getName(), dummy.getDescription());
	}
	
	public Dummy mapModelToEntity(DummyModel dummyModel) {
		Dummy dummy = new Dummy();
		dummy.setId(dummyModel.getId());
		dummy.setName(dummyModel.getName());
		dummy.setDescription(dummyModel.getDescription());
		
		return dummy;
	}
}
