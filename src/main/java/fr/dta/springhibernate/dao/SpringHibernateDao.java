/**
 * 
 */
package fr.dta.springhibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;



/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 *
 *
 * Repository Hibernate pour les fonctions de bases (La session , l'ajout(persist) , 
 * 										la modification(merge) , la suppression (delete)
 *
 * SpringHibernateDao.java
 */
@Repository
public class SpringHibernateDao {
	
	@PersistenceContext
	protected EntityManager em;
	

	protected Session getSession() {
		return em.unwrap(Session.class);
	}
	
	public void persist(Object entity) {
		em.persist(entity);
	}

	public Object update(Object entity) {
		return em.merge(entity);
	}

	public void delete(Object entity) {
		getSession().delete(entity);
	}

}
