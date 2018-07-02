package com.juancrud.gym.services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.juancrud.gym.services.interfaces.IBaseService;

public abstract class BaseService<E, ID, R extends CrudRepository<E, ID>> implements IBaseService<E, ID> {
	
	@Autowired
	private R repository;
	
	public Collection<E> getAll() {
		Iterable<E> iterable = repository.findAll();
		
		Collection<E> result = new ArrayList<E>();
		iterable.forEach(result::add);
		return result;
	}
	
	public E get(ID id) {
		return repository.findById(id).get();
	}
	
	public long count() {
		return repository.count();
	}
	
	public E save(E entity) {
		return repository.save(entity);
	}
	
	public boolean delete(E entity) {
		repository.delete(entity);
		return true;
	}
	
	public boolean deleteById(ID id) {
		repository.deleteById(id);
		return true;
	}
	
}
