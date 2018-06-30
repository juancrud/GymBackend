package com.juancrud.gym.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juancrud.gym.dao.MeasurementItem;

@Repository
public interface MeasurementItemRepository extends CrudRepository<MeasurementItem, Integer> {

}
