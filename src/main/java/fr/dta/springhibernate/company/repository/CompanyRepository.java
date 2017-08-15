/**
 * 
 */
package fr.dta.springhibernate.company.repository;

import fr.dta.springhibernate.company.model.Company;
import fr.dta.springhibernate.repository.AppRepository;

/**
 * @author Ayoub Benghal
 * 
 * 
 *
 *
 * 2017
 *
 *
 * CompanyRepository.java
 */
public interface CompanyRepository extends AppRepository<Company>{
	
	Company findByName(String name);
	void restartSequenceCompanyId();

}
