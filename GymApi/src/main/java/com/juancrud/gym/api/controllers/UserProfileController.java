package com.juancrud.gym.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancrud.gym.services.UserProfileService;
import com.juancrud.gym.services.models.UserProfileModel;

@RestController
@RequestMapping("/userProfiles")
public class UserProfileController {
	
	@Autowired
	private UserProfileService userProfileService;
	
	@GetMapping("/getByEmailAddress/{emailAddress}")
	public UserProfileModel getByEmailAddress(@PathVariable String emailAddress) {
		return userProfileService.getByEmailAddress(emailAddress);
	}
}
