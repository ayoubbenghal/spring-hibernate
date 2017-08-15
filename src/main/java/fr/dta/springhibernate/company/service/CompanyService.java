/**
 * 
 */
package fr.dta.springhibernate.company.service;

import fr.dta.springhibernate.company.model.Company;
import fr.dta.springhibernate.company.repository.CompanyRepository;
import fr.dta.springhibernate.service.AppService;

/**
 * @author Ayoub Benghal
 * 
 * 
 *
 *
 * 2017
 *
 *
 * CompanyService.java
 */
public interface CompanyService extends AppService<Company>{
	/**
	 * @param name
	 * @return
	 * Company
	 * 
	 * Service pour Trouver une Société par nom appellant le bean {@link CompanyRepository}
	 *
	 */
	Company findByName(String name);
	/**
	 * 
	 * void
	 * 
	 * Service pour Redemarrer une sequence de generation d'ids appellant le bean {@link CompanyRepository}
	 *
	 */
	void restartSequenceCompanyId();
}
