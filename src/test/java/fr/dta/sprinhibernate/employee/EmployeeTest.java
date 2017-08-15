/**
 * 
 */
package fr.dta.sprinhibernate.employee;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import fr.dta.springhibernate.employee.model.Employee;
import fr.dta.springhibernate.employee.service.EmployeeService;
import fr.dta.sprinhibernate.AppTest;

/**
 * @author Ayoub Benghal
 * 
 * 
 *
 *
 * 2017
 *
 *
 * EmployeeTest.java
 */
public class EmployeeTest {
	
	private static EmployeeService employeeService;
	private static Employee e;
	private static List<Employee> employees;
	@BeforeClass
	public static void before() {
		employeeService=(EmployeeService)AppTest.getInstance().getBean("employeeMockService");
		e=new Employee();
		employees=new ArrayList<>();
		employees.add(new Employee("BENGHAL", "Ayoub"));
		employees.add(new Employee("BENGHAL", "Imen"));
		employees.add(new Employee("BENGHAL", "Rita"));
		
		employeeService.truncate();
		employeeService.restartSequenceEmployeeId();
	}

	@Test
	public void test1() {
		employeeService.add(e);
	}
	@Test
	public void test2() {
		e.setDateEmbauche(LocalDate.of(2017, 9, 1));
		e.setNom("BENGHAL");
		//e.setCompte(new Account("ayoub"));
		employeeService.updateType(e);
	}
	
	@Test
	public void test3() {
		employeeService.addList(employees);
	}
	@Test
	public void test4() {
		assertTrue(employeeService.getList().size()==4);
	}
	@Test
	public void test5() {
		e.setIdSecu("123456");
		employeeService.updateType(e);
		assertTrue(e.equals(employeeService.findBySsn("123456")));
	}
	
	

}
