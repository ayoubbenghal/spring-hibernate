/**
 * 
 */
package fr.dta.springhibernate.company.repository;

import fr.dta.springhibernate.company.model.Company;
import fr.dta.springhibernate.repository.AppRepository;


/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * Interface pour le repository de la société
 *
 *
 * CompanyRepository.java
 */
public interface CompanyRepository extends AppRepository<Company>{
	
	/**
	 * @param name
	 * @return
	 * Company
	 * 
	 * Trouver une société par nom
	 *
	 */
	Company findByName(String name);
	/**
	 * 
	 * void
	 * 
	 * Redemarrer la sequence qui genere les ids 
	 *
	 */
	void restartSequenceCompanyId();

}
