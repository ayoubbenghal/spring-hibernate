/**
 * 
 */
package fr.dta.springhibernate.account.repository;

import fr.dta.springhibernate.account.model.Account;
import fr.dta.springhibernate.repository.AppRepository;


/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * Interface du Repository du compte
 *
 *
 * AccountRepository.java
 */
public interface AccountRepository extends AppRepository<Account>{
	/**
	 * @param userName
	 * void
	 * Trouver un Compte par userName
	 *
	 */
	Account findByUserName(String userName);
	
	
	
}
