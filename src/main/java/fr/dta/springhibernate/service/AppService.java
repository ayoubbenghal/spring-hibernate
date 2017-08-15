/**
 * 
 */
package fr.dta.springhibernate.service;

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
 * AppService.java
 */
public interface AppService <T> {
	
	void add(T t);
	void addList(List<T> list);
	void updateType(T t);
	List<T> getList();
	void truncate();

}
