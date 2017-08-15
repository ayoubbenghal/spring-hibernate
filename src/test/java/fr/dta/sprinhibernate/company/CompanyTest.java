/**
 * 
 */
package fr.dta.sprinhibernate.company;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import fr.dta.springhibernate.company.model.Company;
import fr.dta.springhibernate.company.service.CompanyService;
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
 * CompanyTest.java
 */
public class CompanyTest{
	
	private static CompanyService companyService;
	private static Company c;
	private static List<Company> companies;
	
	@BeforeClass
	public static void before() {
		companyService=(CompanyService)AppTest.getInstance().getBean("companyMockService");
		c=new Company();
		companies=new ArrayList<>();
		companies.add(new Company("sopra"));
		companies.add(new Company("atos"));
		companies.add(new Company("iocean"));
		companyService.truncate();
		companyService.restartSequenceCompanyId();
	}

	@Test
	public void test1() {
		companyService.add(c);
	}
	
	@Test
	public void test2() {
		
		companyService.addList(companies);
	}
	@Test
	public void test3() {
		c.setNom("dta");
		companyService.updateType(c);
	}
	@Test
	public void test4() {
		assertTrue(companyService.getList().size()==4);
	}
	
	@Test
	public void test5() {
		assertTrue(companyService.findByName("dta").equals(c));
	}

}
