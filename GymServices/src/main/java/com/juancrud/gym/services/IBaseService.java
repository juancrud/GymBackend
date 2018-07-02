package com.juancrud.gym.services;

import java.util.Collection;

public interface IBaseService<E, ID> {
	Collection<E> getAll();
	E get(ID id);
	long count();
	E save(E entity);
	boolean delete(E entity);
	boolean deleteById(ID id);
}
