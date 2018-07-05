package com.juancrud.gym.services.mappers;

import com.juancrud.gym.dao.Dummy;
import com.juancrud.gym.services.models.DummyModel;

public class DummyMapper {

	public DummyModel mapDaoToModel(Dummy dummy) {
		return new DummyModel(dummy.getId(), dummy.getName(), dummy.getDescription());
	}
	
	public Dummy mapModelToDao(DummyModel dummyModel) {
		Dummy dummy = new Dummy();
		dummy.setId(dummyModel.getId());
		dummy.setName(dummyModel.getName());
		dummy.setDescription(dummyModel.getDescription());
		
		return dummy;
	}
}
