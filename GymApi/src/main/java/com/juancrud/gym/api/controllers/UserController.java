package com.juancrud.gym.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.services.UserService;
import com.juancrud.gym.services.models.UserModel;

@RestController
@RequestMapping("/users")
public class UserController extends BaseController<UserModel, Integer> {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getByIdentityId")
	public UserModel getByIdentityId(@RequestParam String identityId) {
		return userService.getByIdentityId(identityId);
	}
	
}
