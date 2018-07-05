package com.juancrud.gym.services.interfaces;

import java.util.Collection;

import com.juancrud.gym.services.models.DummyModel;

public interface IDummyService {
	Collection<DummyModel> getAll();
	DummyModel get(Integer id);
	long count();
	DummyModel save(DummyModel dummyModel);
	boolean delete(DummyModel dummyModel);
	boolean deleteById(Integer id);

}
