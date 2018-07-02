package com.juancrud.gym.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.MeasurementItem;

@Service
public class MeasurementItemService extends BaseService<MeasurementItem, Integer, CrudRepository<MeasurementItem, Integer>> implements IMeasurementItemService {

}
