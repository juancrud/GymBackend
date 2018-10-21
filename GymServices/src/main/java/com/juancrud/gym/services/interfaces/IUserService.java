package com.juancrud.gym.services.interfaces;

import com.juancrud.gym.services.models.UserModel;

public interface IUserService extends IBaseService<UserModel, Integer> {
	UserModel getByIdentityId(String identityId);
}
