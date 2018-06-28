package com.juancrud.gym.repositories;

import org.springframework.data.repository.CrudRepository;

import com.juancrud.gym.dao.ExerciseCategory;

public interface ExerciseCategoryRepository extends CrudRepository<ExerciseCategory, Integer> {

}
