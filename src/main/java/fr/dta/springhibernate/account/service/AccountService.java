/**
 * 
 */
package fr.dta.springhibernate.account.service;

import fr.dta.springhibernate.account.model.Account;
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
 * AccountService.java
 */
public interface AccountService extends AppService<Account>{
	/**
	 * @param userName
	 * void
	 *
	 */
	Account findByUserName(String userName);
	
}
