package com.juancrud.gym.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juancrud.gym.dao.Exercise;

@Repository
public interface ExerciseRepository extends CrudRepository<Exercise, Integer> {

}
