package com.juancrud.gym.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.User;
import com.juancrud.gym.repositories.UserRepository;
import com.juancrud.gym.services.exceptions.GymServiceException;
import com.juancrud.gym.services.interfaces.IUserService;
import com.juancrud.gym.services.mappers.UserMapper;
import com.juancrud.gym.services.models.UserModel;

@Service
public class UserService extends BaseService<UserModel, User, Integer> implements IUserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public UserModel getByIdentityId(String identityId) {
		Optional<User> response = userRepository.getByIdentityId(identityId);
		if (!response.isPresent()) throw new GymServiceException("User not found (identityId: " + identityId + ").");
		
		return userMapper.mapEntityToModel(response.get());
	}

}
