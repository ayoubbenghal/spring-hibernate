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
	
	/**
	 * @param t
	 * void
	 *
	 */
	void add(T t);
	/**
	 * @param list
	 * void
	 *
	 */
	void addList(List<T> list);
	/**
	 * @param t
	 * void
	 *
	 */
	void updateType(T t);
	/**
	 * @return
	 * List<T>
	 *
	 */
	List<T> getList();
	/**
	 * 
	 * void
	 *
	 */
	void truncate();

}
