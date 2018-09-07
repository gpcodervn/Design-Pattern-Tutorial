/*
 * https://gpcoder.com
 */
package com.gpcoder.solid;

/**
 * ISP – Interface segregation principle example
 * 
 * @author gpcoder
 */
interface Repository<T, ID> {

	Iterable<T> findAll();

	T findOne(Long id);

	T save(T entity);

	void update(T entity);

	void delete(T entity);

	Page<T> findAll(Pageable pageable);

	Iterable<T> findAll(Sort sort);
}

interface CrudRepository<T, ID> {

	Iterable<T> findAll();

	T findOne(Long id);

	T save(T entity);

	void update(T entity);

	void delete(T entity);

}

interface PagingAndSortingRepository<T, ID> extends CrudRepository<T, ID> {

	Page<T> findAll(Pageable pageable);

	Iterable<T> findAll(Sort sort);
}

class Sort {
}

class Pageable {
}

class Page<T> {
}

public class ISPExample {

}
