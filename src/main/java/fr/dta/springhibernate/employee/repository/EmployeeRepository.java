/**
 * 
 */
package fr.dta.springhibernate.employee.repository;

import fr.dta.springhibernate.employee.model.Employee;
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
 * EmployeeRepository.java
 */
public interface EmployeeRepository extends AppRepository<Employee> {
	void restartSequenceEmployeeId();
	Employee findBySsn(String ssn);

}
