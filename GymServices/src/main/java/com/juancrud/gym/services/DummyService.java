package com.juancrud.gym.services;

import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Dummy;
import com.juancrud.gym.services.interfaces.IDummyService;
import com.juancrud.gym.services.models.DummyModel;

@Service
public class DummyService extends BaseService<DummyModel, Dummy, Integer> implements IDummyService {

}
