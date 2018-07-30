package com.juancrud.gym.services.interfaces;

import java.util.Collection;
import java.util.Map;

public interface IBaseService<M, ID> {
	Collection<M> getAll();
	Collection<M> search(Map<String, String> searchParams);
	M get(ID id);
	long count();
	M create(M entity);
	M update(M entity);
	boolean delete(M entity);
	boolean deleteById(ID id);
}
