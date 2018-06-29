package com.juancrud.gym.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juancrud.gym.dao.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
