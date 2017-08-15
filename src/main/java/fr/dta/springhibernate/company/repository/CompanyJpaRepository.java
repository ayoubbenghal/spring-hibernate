/**
 * 
 */
package fr.dta.springhibernate.company.repository;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.dta.springhibernate.company.model.Company;
import fr.dta.springhibernate.dao.SpringHibernateDao;


/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * Repository pour les requétes vers la Base de donnés
 * Herite de {@link SpringHibernateDao} pour les requétes de base et pour la connection
 *
 *
 * CompanyJpaRepository.java
 */
@Repository
@Transactional
public class CompanyJpaRepository extends SpringHibernateDao implements CompanyRepository{

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.repository.AppRepository#add(java.lang.Object)
	 */
	@Override
	public void add(Company t) {
			persist(t);
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.repository.AppRepository#addList(java.util.List)
	 */
	@Override
	public void addList(List<Company> list) {
		list.forEach(company->add(company));
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.repository.AppRepository#updateType(java.lang.Object)
	 */
	@Override
	public void updateType(Company t) {
		update(t);
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.repository.AppRepository#getList()
	 */
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Company> getList() {
		return getSession().createCriteria(Company.class).list();
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.repository.AppRepository#truncate()
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void truncate() {
			getSession().createSQLQuery("delete from Company").executeUpdate();
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.company.repository.CompanyRepository#findByName()
	 */
	@SuppressWarnings("deprecation")
	@Override
	public Company findByName(String name) {
		return (Company) getSession().createCriteria(Company.class).add(Restrictions.eq("nom", name)).uniqueResult();
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.company.repository.CompanyRepository#restartSequenceId()
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void restartSequenceCompanyId() {
		getSession().createSQLQuery("ALTER SEQUENCE seq_company RESTART WITH 1").executeUpdate();
		
	}
	
	

}
