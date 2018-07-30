package com.juancrud.gym.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.juancrud.gym.services.exceptions.GymServiceException;
import com.juancrud.gym.services.interfaces.IBaseService;
import com.juancrud.gym.services.mappers.IModelEntityMapper;
import com.juancrud.gym.services.models.EntityModel;

public abstract class BaseService<M extends EntityModel<ID>, E, ID> implements IBaseService<M, ID> {
	
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
	
	public Collection<M> search(Map<String, String> searchParams) {
		return new ArrayList<M>();
	}
	
	public M get(ID id) {
		// TODO: Reflection helper
		Optional<E> response = repository.findById(id);
		if (!response.isPresent()) throw new GymServiceException("Entity not found (id: " + id + ").");
		
		return mapper.mapEntityToModel(response.get());
	}
	
	public long count() {
		return repository.count();
	}
	
	public M create(M model) {
		if (model.getId() != null) throw new GymServiceException("Cannot create entity with id.");
		
		E entity = mapper.mapModelToEntity(model);
		repository.save(entity);
		return mapper.mapEntityToModel(entity);
	}
	
	public M update(M model) {
		if (model.getId() == null) throw new GymServiceException("Cannot update entity without id.");
		
		E entity = mapper.mapModelToEntity(model);
		repository.save(entity);
		return mapper.mapEntityToModel(entity);
	}
	
	public boolean delete(M model) {
		if (model.getId() == null) throw new GymServiceException("Cannot delete entity without id.");
		
		E entity = mapper.mapModelToEntity(model);
		repository.delete(entity);
		return true;
	}
	
	public boolean deleteById(ID id) {
		repository.deleteById(id);
		return true;
	}
	
}
