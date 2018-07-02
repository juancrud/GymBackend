package com.juancrud.gym.api.controllers;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.juancrud.gym.services.interfaces.IBaseService;

public abstract class BaseController<E, ID, S extends IBaseService<E, ID>> {
	
	@Autowired
    private S service;
	
	@GetMapping("/")
	public Collection<E> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public E get(@PathVariable ID id) {
		return service.get(id);
	}
	
	@PostMapping("/")
	public E add(@RequestBody E entity) {
		return service.save(entity);
	}
	
	@PutMapping("/")
	public E update(@RequestBody E entity) {
		return service.save(entity);
	}
	
	@DeleteMapping("/{id}")
	public E remove(@PathVariable ID id) {
		E entity = service.get(id);
		service.deleteById(id);
		return entity;
	}
	
	@GetMapping("/ping")
	public String testPing() {
		return "Test Ping.. ";
	}
	
}
