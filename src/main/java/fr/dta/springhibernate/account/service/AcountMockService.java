/**
 * 
 */
package fr.dta.springhibernate.account.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.dta.springhibernate.account.model.Account;
import fr.dta.springhibernate.account.repository.AccountRepository;


/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 *
 *
 * Service pour les méthodes du Compte
 *
 * AcountMockService.java
 */
@Service
@Transactional
public class AcountMockService implements AccountService{
	/**
	 *AcountMockService.java
	 * accountRepository
	 * 
	 * Injection du Bean @see {@link AccountRepository} par attribut
	 */
	@Autowired
	private AccountRepository accountRepository;

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.service.AppService#add(java.lang.Object)
	 */
	@Override
	public void add(Account t) {
			accountRepository.add(t);
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.service.AppService#addList(java.util.List)
	 */
	@Override
	public void addList(List<Account> list) {
		accountRepository.addList(list);
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.service.AppService#update(java.lang.Object)
	 */
	@Override
	public void updateType(Account t) {
		accountRepository.updateType(t);
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.service.AppService#getList()
	 */
	@Override
	public List<Account> getList() {
		return accountRepository.getList();
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.service.AppService#truncate()
	 */
	@Override
	public void truncate() {
			accountRepository.truncate();
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.account.service.AccountService#findByUserName(java.lang.String)
	 */
	@Override
	public Account findByUserName(String userName) {
		return accountRepository.findByUserName(userName);
	}
	
	
}
