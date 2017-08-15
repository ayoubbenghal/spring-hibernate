/**
 * 
 */
package fr.dta.springhibernate.employee.service;

import fr.dta.springhibernate.employee.model.Employee;
import fr.dta.springhibernate.employee.repository.EmployeeRepository;
import fr.dta.springhibernate.service.AppService;


/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * Service pour les employés
 *
 *
 * EmployeeService.java
 */
public interface EmployeeService extends AppService<Employee>{
	/**
	 * 
	 * void
	 * 
	 * Service pour redemarrer la sequence qui genere les ids de l'employé en appellant le bean
	 * 																{@link EmployeeRepository}
	 *
	 */
	void restartSequenceEmployeeId();
	/**
	 * @param ssn
	 * @return
	 * Employee
	 *
	 *
	 * Service appellant le bean {@link EmployeeRepository} pour trouver un employé par le numero
	 * de securité sociale
	 */
	Employee findBySsn(String ssn);

}
