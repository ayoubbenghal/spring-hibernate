/**
 * 
 */
package fr.dta.springhibernate.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.dta.springhibernate.employee.model.Employee;
import fr.dta.springhibernate.employee.repository.EmployeeRepository;


/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 *
 *
 * Service pour les fonctions de l'employee
 * 
 * Un rollback pour les exception de type {@link RuntimeException}
 *
 *
 * EmployeeMockService.java
 */
@Service
@Transactional(rollbackFor= {RuntimeException.class})
public class EmployeeMockService implements EmployeeService{
	
	/**
	 *EmployeeMockService.java
	 * employeeRepository
	 * 
	 * Injection du bean {@link EmployeeRepository} par attribut
	 */
	@Autowired
	private EmployeeRepository employeeRepository;

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.service.AppService#add(java.lang.Object)
	 */
	@Override
	public void add(Employee t) {
		employeeRepository.add(t);
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.service.AppService#addList(java.util.List)
	 */
	@Override
	public void addList(List<Employee> list) {
		employeeRepository.addList(list);
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.service.AppService#updateType(java.lang.Object)
	 */
	@Override
	public void updateType(Employee t) {
		employeeRepository.updateType(t);
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.service.AppService#getList()
	 */
	@Override
	public List<Employee> getList() {
		return employeeRepository.getList();
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.service.AppService#truncate()
	 */
	@Override
	public void truncate() {
		employeeRepository.truncate();
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.employee.service.EmployeeService#restartSequenceEmployeeId()
	 */
	@Override
	public void restartSequenceEmployeeId() {
			employeeRepository.restartSequenceEmployeeId();
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.employee.service.EmployeeService#findBySsn(java.lang.String)
	 */
	@Override
	public Employee findBySsn(String ssn) {
		Employee e=employeeRepository.findBySsn(ssn);
		if(e==null) {
			employeeRepository.add(new Employee("RUNTIME", "EXCEPTION"));
			throw new RuntimeException();
		}
		return e;
	}

}
