package com.juancrud.gym.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juancrud.gym.dao.Trainer;

@Repository
public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

	Optional<Trainer> getByPersonEmailAddress(String emailAddress);
	
}
