package com.juancrud.gym.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juancrud.gym.dao.Customer;
import com.juancrud.gym.dao.Trainer;
import com.juancrud.gym.dao.enums.UserTypeEnum;
import com.juancrud.gym.repositories.CustomerRepository;
import com.juancrud.gym.repositories.TrainerRepository;
import com.juancrud.gym.services.interfaces.IUserProfileService;
import com.juancrud.gym.services.models.UserProfileModel;

@Service
public class UserProfileService implements IUserProfileService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private TrainerRepository trainerRepository;

	public UserProfileModel getByEmailAddress(String emailAddress) {
		UserTypeEnum type = UserTypeEnum.Administrator;
		
		Optional<Customer> customer = customerRepository.getByPersonEmailAddress(emailAddress);
		Optional<Trainer> trainer = trainerRepository.getByPersonEmailAddress(emailAddress);
		
		if (customer.isPresent()) {
			type = UserTypeEnum.Customer;
		}
		else if(trainer.isPresent()) {
			type = UserTypeEnum.Trainer;
		}
		
		return new UserProfileModel(emailAddress, type);
	}

}
