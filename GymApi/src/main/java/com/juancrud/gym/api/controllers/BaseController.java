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

public abstract class BaseController<M, ID> {
	
	@Autowired
    private IBaseService<M, ID> service;
	
	@GetMapping("/")
	public Collection<M> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public M get(@PathVariable ID id) {
		return service.get(id);
	}
	
	@PostMapping("/")
	public M add(@RequestBody M model) {
		return service.save(model);
	}
	
	@PutMapping("/")
	public M update(@RequestBody M model) {
		return service.save(model);
	}
	
	@DeleteMapping("/{id}")
	public M remove(@PathVariable ID id) {
		M model = service.get(id);
		service.deleteById(id);
		return model;
	}
	
	@GetMapping("/ping")
	public String testPing() {
		return "Test Ping.. ";
	}
	
}
