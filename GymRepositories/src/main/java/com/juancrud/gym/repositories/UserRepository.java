package com.juancrud.gym.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juancrud.gym.dao.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	Optional<User> getByIdentityId(String identityId); 
	
}
