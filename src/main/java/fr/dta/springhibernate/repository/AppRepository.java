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
 * Interface regrouppant les fonctionnalités communes des composants de l'application
 *
 * AppRepository.java
 */
public interface AppRepository <T>{
	/**
	 * @param t
	 * void
	 * 
	 * Ajouter un Objet d'un type précis
	 *
	 */
	void add(T t);
	/**
	 * @param list
	 * void
	 *
	 *Ajouter une liste d'Objets d'un type précis
	 */
	void addList(List<T> list);
	/**
	 * @param t
	 * void
	 * 
	 * Modifier un Objet d'un type précis
	 *
	 */
	void updateType(T t);
	/**
	 * @return
	 * List<T>
	 *
	 * Recuperer une liste d'objet d'un type précis
	 * 
	 */
	List<T> getList();
	/**
	 * 
	 * void
	 * 
	 * 
	 * Supprimer tous les objets d'un type
	 *
	 */
	void truncate();
	

}
