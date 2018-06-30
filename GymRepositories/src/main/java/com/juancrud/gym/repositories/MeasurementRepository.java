package com.juancrud.gym.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juancrud.gym.dao.Measurement;

@Repository
public interface MeasurementRepository extends CrudRepository<Measurement, Integer> {

}
