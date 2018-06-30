package com.juancrud.gym.services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.MeasurementItem;
import com.juancrud.gym.repositories.MeasurementItemRepository;

@Service
public class MeasurementItemService implements IMeasurementItemService {

	@Autowired
	private MeasurementItemRepository measurementItemRepository;
	
	public Collection<MeasurementItem> getAll() {
		Iterable<MeasurementItem> iterable = measurementItemRepository.findAll();
		
		Collection<MeasurementItem> result = new ArrayList<MeasurementItem>();
		iterable.forEach(result::add);
		return result;
	}

	public MeasurementItem get(int id) {
		return measurementItemRepository.findById(id).get();
	}

	public MeasurementItem save(MeasurementItem measurementItem) {
		return measurementItemRepository.save(measurementItem);
	}

}
