/**
 * 
 */
package fr.dta.springhibernate.company.service;

import fr.dta.springhibernate.company.model.Company;
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
	Company findByName(String name);
	void restartSequenceCompanyId();
}
