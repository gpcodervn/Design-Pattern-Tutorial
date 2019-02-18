package com.gpcoder.patterns.other.dto;

import java.util.List;
import java.util.Optional;

/**
 * Data Access Object
 */
public interface Dao<T> {

	List<T> getAll();

	Optional<T> get(Integer id);

	void save(T t);

	void update(T t);

	void delete(T t);
}
