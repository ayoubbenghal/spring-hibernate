/**
 * 
 */
package fr.dta.springhibernate.repository;

import java.util.List;

/**
 * @author Ayoub Benghal
 * 
 * 
 *
 *
 * 2017
 *
 *
 * AppRepository.java
 */
public interface AppRepository <T>{
	void add(T t);
	void addList(List<T> list);
	void updateType(T t);
	List<T> getList();
	void truncate();
	

}
