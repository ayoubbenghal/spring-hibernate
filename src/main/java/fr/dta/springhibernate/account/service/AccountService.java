/**
 * 
 */
package fr.dta.springhibernate.account.service;

import fr.dta.springhibernate.account.model.Account;
import fr.dta.springhibernate.account.repository.AccountRepository;
import fr.dta.springhibernate.service.AppService;


/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * Interface du service 
 *
 *
 * AccountService.java
 */
public interface AccountService extends AppService<Account>{
	/**
	 * @param userName
	 * void
	 * 
	 * Service Appellant le bean {@link AccountRepository} pour chercher un compte par userName
	 *
	 */
	Account findByUserName(String userName);
	
}
