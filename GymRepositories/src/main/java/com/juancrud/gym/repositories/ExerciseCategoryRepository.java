package com.juancrud.gym.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juancrud.gym.dao.ExerciseCategory;

@Repository
public interface ExerciseCategoryRepository extends CrudRepository<ExerciseCategory, Integer> {

}
