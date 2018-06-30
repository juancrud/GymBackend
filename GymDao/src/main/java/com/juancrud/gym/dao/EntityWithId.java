package com.juancrud.gym.dao;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class EntityWithId {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "Id")
    private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	/*TEST*/
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (getClass() != o.getClass()) return false;
		
		EntityWithId otherObject = (EntityWithId)o;
		return id != null && id.equals(otherObject.getId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getClass(), id);
	}
	/*TEST*/
}
