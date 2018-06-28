package com.juancrud.gym.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exerciseCategories")
public class ExerciseCategoryController {

	@GetMapping("/test")
	public String test() {
		return "Hello World from controller";
	}
	
}
