package com.juancrud.gym.services.interfaces;

import com.juancrud.gym.services.models.TrainerModel;

public interface ITrainerService extends IBaseService<TrainerModel, Integer> {
	TrainerModel getByEmailAddress(String emailAddress);
}
