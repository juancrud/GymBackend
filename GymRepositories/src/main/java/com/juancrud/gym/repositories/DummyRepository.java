package com.juancrud.gym.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juancrud.gym.dao.Dummy;

@Repository
public interface DummyRepository extends CrudRepository<Dummy, Integer> {

}
