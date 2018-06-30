package com.juancrud.gym.services;

import java.util.Collection;

import com.juancrud.gym.dao.MeasurementItem;

public interface IMeasurementItemService {
	Collection<MeasurementItem> getAll();
	MeasurementItem get(int id);
	MeasurementItem save(MeasurementItem measurementItem);
}
