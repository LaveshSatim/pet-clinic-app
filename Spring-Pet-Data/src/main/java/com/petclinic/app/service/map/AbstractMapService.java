package com.petclinic.app.service.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import com.petclinic.app.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

	protected Map<Long, T> map = new HashMap<>();

	public Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	public T findById(ID id) {
		return map.get(id);
	}

	public T save(T object) {

		if (object != null) {
			if (object.getId() == null) {
				object.setId(nextID());
			}
			map.put(object.getId(), object);
		} else {
			throw new RuntimeException("Object can not be null");
		}
		return object;
	}

	public void deleteById(ID id) {
		map.remove(id);
	}

	public void delete(T object) {
		map.entrySet().removeIf(test -> test.getValue().equals(object));
	}

	private Long nextID() {

		Long value = null;
		try {
			value = Collections.max(map.keySet()) + 1;
		} catch (NoSuchElementException e) {
			value = 1L;
		}

		return value;
	}
}
