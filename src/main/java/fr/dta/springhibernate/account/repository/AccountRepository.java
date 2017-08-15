/**
 * 
 */
package fr.dta.springhibernate.account.repository;

import fr.dta.springhibernate.account.model.Account;
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
 * AccountRepository.java
 */
public interface AccountRepository extends AppRepository<Account>{
	/**
	 * @param userName
	 * void
	 *
	 */
	Account findByUserName(String userName);
	
	
	
}
