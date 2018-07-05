package com.juancrud.gym.services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.juancrud.gym.services.interfaces.IBaseService;
import com.juancrud.gym.services.mappers.IModelEntityMapper;

public abstract class BaseService<M, E, ID> implements IBaseService<M, ID> {
	
	@Autowired
	private CrudRepository<E, ID> repository;
	
	@Autowired
	private IModelEntityMapper<M, E> mapper;
	
	public Collection<M> getAll() {
		Iterable<E> iterable = repository.findAll();
		
		Collection<M> result = new ArrayList<M>();
		iterable.forEach(x -> result.add(mapper.mapEntityToModel(x)));
		return result;
	}
	
	public M get(ID id) {
		E entity = repository.findById(id).get();
		return mapper.mapEntityToModel(entity);
	}
	
	public long count() {
		return repository.count();
	}
	
	public M save(M model) {
		E entity = mapper.mapModelToEntity(model);
		repository.save(entity);
		return mapper.mapEntityToModel(entity);
	}
	
	public boolean delete(M model) {
		E entity = mapper.mapModelToEntity(model);
		repository.delete(entity);
		return true;
	}
	
	public boolean deleteById(ID id) {
		repository.deleteById(id);
		return true;
	}
	
}
