package com.juancrud.gym.services.interfaces;

import com.juancrud.gym.services.models.UserProfileModel;

public interface IUserProfileService {
	UserProfileModel getByEmailAddress(String emailAddress);
}
