package com.petclinic.app.service;

import java.util.Set;

import com.petclinic.app.model.Owner;

public interface Crud<T, ID> {

	T findById(ID id);

	T save(T object);

	Set<T> findAll();
	
	void delete(T object);
	
	void deleteById(ID id);
}
