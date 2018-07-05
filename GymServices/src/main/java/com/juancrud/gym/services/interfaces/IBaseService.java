package com.juancrud.gym.services.interfaces;

import java.util.Collection;

public interface IBaseService<M, ID> {
	Collection<M> getAll();
	M get(ID id);
	long count();
	M save(M entity);
	boolean delete(M entity);
	boolean deleteById(ID id);
}
