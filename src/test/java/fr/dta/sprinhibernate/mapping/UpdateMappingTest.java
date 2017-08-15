/**
 * 
 */
package fr.dta.sprinhibernate.mapping;

import org.junit.BeforeClass;
import org.junit.Test;

import fr.dta.springhibernate.account.service.AccountService;
import fr.dta.springhibernate.company.service.CompanyService;
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
 * UpdateMappingTest.java
 */
public class UpdateMappingTest extends AppTest{
	
	private static EmployeeService employeeService;
	private static AccountService accountService;
	private static CompanyService companyService;

	
	@BeforeClass
	public static void before() {
		employeeService=(EmployeeService)AppTest.getInstance().getBean("employeeMockService");
		accountService=(AccountService)AppTest.getInstance().getBean("acountMockService");
		companyService=(CompanyService)AppTest.getInstance().getBean("companyMockService");	
	}

	@Test
	public void test1() {
		Employee e=employeeService.findBySsn("123456");
		e.setCompte(accountService.findByUserName("ayoub"));
		e.setSociete(companyService.findByName("dta"));
		employeeService.updateType(e);
	}
	@Test(expected=RuntimeException.class)
	public void test2() {
		Employee e2=employeeService.findBySsn("1234");
		employeeService.updateType(e2);
	}

}
