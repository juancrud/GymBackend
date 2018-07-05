package com.juancrud.gym.services.mappers;

public interface IModelEntityMapper<M, E> {
	M mapEntityToModel(E entity);
	E mapModelToEntity(M model);
}
