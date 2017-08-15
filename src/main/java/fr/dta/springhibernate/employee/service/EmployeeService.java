/**
 * 
 */
package fr.dta.springhibernate.employee.service;

import fr.dta.springhibernate.employee.model.Employee;
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
 * EmployeeService.java
 */
public interface EmployeeService extends AppService<Employee>{
	void restartSequenceEmployeeId();
	Employee findBySsn(String ssn);

}
