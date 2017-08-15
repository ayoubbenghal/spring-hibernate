/**
 * 
 */
package fr.dta.springhibernate.employee.repository;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.dta.springhibernate.dao.SpringHibernateDao;
import fr.dta.springhibernate.employee.model.Employee;


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
 * EmployeeJpaRepository.java
 */
@Repository
@Transactional
public class EmployeeJpaRepository extends SpringHibernateDao implements EmployeeRepository{

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.repository.AppRepository#add(java.lang.Object)
	 */
	@Override
	public void add(Employee t) {
			persist(t);
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.repository.AppRepository#addList(java.util.List)
	 */
	@Override
	public void addList(List<Employee> list) {
			list.forEach(e->persist(e));
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.repository.AppRepository#updateType(java.lang.Object)
	 */
	@Override
	public void updateType(Employee t) {
			update(t);
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.repository.AppRepository#getList()
	 */
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Employee> getList() {
		return getSession().createCriteria(Employee.class).list();
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.repository.AppRepository#truncate()
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void truncate() {
			getSession().createSQLQuery("delete from Employee").executeUpdate();
			
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.employee.repository.EmployeeRepository#restartSequenceEmployeeId()
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void restartSequenceEmployeeId() {
		getSession().createSQLQuery("ALTER SEQUENCE seq_employee RESTART WITH 1").executeUpdate();

	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.employee.repository.EmployeeRepository#findBySsn(java.lang.String)
	 */
	@SuppressWarnings("deprecation")
	@Override
	public Employee findBySsn(String ssn) {
		return (Employee) getSession().createCriteria(Employee.class).add(Restrictions.eq("idSecu", ssn)).uniqueResult();
	}
	

}
