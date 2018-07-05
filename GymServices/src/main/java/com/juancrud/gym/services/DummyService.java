package com.juancrud.gym.services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Dummy;
import com.juancrud.gym.repositories.DummyRepository;
import com.juancrud.gym.services.interfaces.IDummyService;
import com.juancrud.gym.services.mappers.DummyMapper;
import com.juancrud.gym.services.models.DummyModel;

@Service
public class DummyService implements IDummyService {

	@Autowired
	private DummyRepository dummyRepository;
	
	private DummyMapper dummyMapper = new DummyMapper();
	
	public Collection<DummyModel> getAll() {
		Iterable<Dummy> iterable = dummyRepository.findAll();
		
		Collection<DummyModel> result = new ArrayList<DummyModel>();
		iterable.forEach(x -> result.add(dummyMapper.mapDaoToModel(x)));
		return result;
	}

	public DummyModel get(Integer id) {
		Dummy dummy = dummyRepository.findById(id).get();
		return dummyMapper.mapDaoToModel(dummy);
	}

	public long count() {
		return dummyRepository.count();
	}

	public DummyModel save(DummyModel dummyModel) {
		Dummy dummy = dummyMapper.mapModelToDao(dummyModel);
		dummyRepository.save(dummy);
		return dummyMapper.mapDaoToModel(dummy);
	}

	public boolean delete(DummyModel dummyModel) {
		Dummy dummy = dummyMapper.mapModelToDao(dummyModel);
		dummyRepository.delete(dummy);
		return true;
	}

	public boolean deleteById(Integer id) {
		dummyRepository.deleteById(id);
		return true;
	}

}
