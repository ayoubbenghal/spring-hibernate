/**
 * 
 */
package fr.dta.springhibernate.employee.repository;

import fr.dta.springhibernate.employee.model.Employee;
import fr.dta.springhibernate.repository.AppRepository;

/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 *
 *
 * Interface du repository de l'employé
 *
 * EmployeeRepository.java
 */
public interface EmployeeRepository extends AppRepository<Employee> {
	/**
	 * 
	 * void
	 * Redemarrer la sequence qui genere les ids
	 *
	 */
	void restartSequenceEmployeeId();
	/**
	 * @param ssn
	 * @return
	 * Employee
	 *
	 * Trouver un Employee par son numero de securité social
	 *
	 */
	Employee findBySsn(String ssn);

}
