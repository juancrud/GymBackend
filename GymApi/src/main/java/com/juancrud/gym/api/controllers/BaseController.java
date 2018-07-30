package com.juancrud.gym.api.controllers;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.juancrud.gym.services.exceptions.GymErrorMessage;
import com.juancrud.gym.services.exceptions.GymServiceException;
import com.juancrud.gym.services.interfaces.IBaseService;
import com.juancrud.gym.services.models.EntityModel;

@ControllerAdvice
public abstract class BaseController<M extends EntityModel<ID>, ID> extends ResponseEntityExceptionHandler{
	
	@Autowired
    private IBaseService<M, ID> service;
	
	@GetMapping("/")
	public Collection<M> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/search")
	public Collection<M> search(@RequestParam Map<String, String> searchParams) {
		return service.search(searchParams);
	}
	
	@GetMapping("/{id}")
	public M get(@PathVariable ID id) {
		return service.get(id);
	}
	
	@PostMapping("/")
	public M add(@RequestBody M model) {
		return service.create(model);
	}
	
	@PutMapping("/")
	public M update(@RequestBody M model) {
		return service.update(model);
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
	
	@ExceptionHandler(GymServiceException.class)
	public GymErrorMessage handleGymServiceException(GymServiceException ex, WebRequest request) {
		GymErrorMessage errorMessage = new GymErrorMessage(new Date(), ex.getMessage(), request.getDescription(false), "");
		return errorMessage;
	}
	
}
