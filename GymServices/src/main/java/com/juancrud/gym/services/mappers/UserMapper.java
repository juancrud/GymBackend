package com.juancrud.gym.services.mappers;

import org.springframework.stereotype.Component;

import com.juancrud.gym.dao.User;
import com.juancrud.gym.services.models.UserModel;

@Component
public class UserMapper implements IModelEntityMapper<UserModel, User>{

	@Override
	public UserModel mapEntityToModel(User user) {
		UserModel userModel = new UserModel();
		userModel.setId(user.getId());
		userModel.setIdentityId(user.getIdentityId());
		userModel.setType(user.getType());
		
		return userModel;
	}

	@Override
	public User mapModelToEntity(UserModel userModel) {
		User user = new User();
		user.setId(userModel.getId());
		user.setIdentityId(userModel.getIdentityId());
		user.setType(userModel.getType());
		
		return user;
	}

}
