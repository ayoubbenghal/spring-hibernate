/**
 * 
 */
package fr.dta.springhibernate.account.repository;

import java.util.List;



import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.dta.springhibernate.account.model.Account;
import fr.dta.springhibernate.dao.SpringHibernateDao;

/**
 * @author Ayoub Benghal
 * 
 * 
 *
 *
 * 2017
 *
 *
 * AccountJpaRepository.java
 */
@Repository
@Transactional
public class AccountJpaRepository extends SpringHibernateDao implements AccountRepository{

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.repository.AppRepository#add(java.lang.Object)
	 */
	@Override
	public void add(Account t) {
		persist(t);
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.repository.AppRepository#addList(java.util.List)
	 */
	@Override
	public void addList(List<Account> list) {
		list.forEach(acount->persist(acount));
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.repository.AppRepository#update(java.lang.Object)
	 */
	@Override
	public void updateType(Account t) {
		update(t);
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.repository.AppRepository#getList()
	 */
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Account> getList() {
		//TypedQuery<Account> typedQuery=getSession().createQuery("SELECT * FROM account");
		
		
		return getSession().createCriteria(Account.class).list();
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.repository.AppRepository#truncate()
	 */
	@Override
	public void truncate() {
			getSession().createQuery("delete from Account").executeUpdate();
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.account.repository.AccountRepository#findByUserName(java.lang.String)
	 */
	@SuppressWarnings("deprecation")
	@Override
	public Account findByUserName(String userName) {
			return (Account) getSession().createCriteria(Account.class).add(Restrictions.eq("userName", userName)).uniqueResult();
	}
	

}
