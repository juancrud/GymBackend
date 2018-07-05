package com.juancrud.gym.services;

import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.MeasurementItem;
import com.juancrud.gym.services.interfaces.IMeasurementItemService;
import com.juancrud.gym.services.models.MeasurementItemModel;

@Service
public class MeasurementItemService extends BaseService<MeasurementItemModel, MeasurementItem, Integer> implements IMeasurementItemService {

}
