package com.juancrud.gym.api.controllers;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.services.interfaces.IDummyService;
import com.juancrud.gym.services.models.DummyModel;

@RestController
@RequestMapping("/dummies")
public class DummyController {

	@Autowired
    private IDummyService dummyService;
	
	@GetMapping("/")
	public Collection<DummyModel> getAll() {
		return dummyService.getAll();
	}
	
	@GetMapping("/{id}")
	public DummyModel get(@PathVariable Integer id) {
		return dummyService.get(id);
	}
	
	@PostMapping("/")
	public DummyModel add(@RequestBody DummyModel model) {
		return dummyService.save(model);
	}
	
	@PutMapping("/")
	public DummyModel update(@RequestBody DummyModel model) {
		return dummyService.save(model);
	}
	
	@DeleteMapping("/{id}")
	public DummyModel remove(@PathVariable Integer id) {
		DummyModel model = dummyService.get(id);
		dummyService.deleteById(id);
		return model;
	}
	
	@GetMapping("/ping")
	public String testPing() {
		return "Test Ping.. ";
	}
	
	@GetMapping("/testNew")
	public DummyModel testNew() {
		return dummyService.save(new DummyModel(null, "Test Name", "Test Description"));
	}
}
