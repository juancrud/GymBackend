package com.juancrud.gym.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juancrud.gym.dao.Media;

@Repository
public interface MediaRepository extends CrudRepository<Media, Integer> {

}
