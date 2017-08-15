/**
 * 
 */
package alltests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.dta.sprinhibernate.account.AccountTest;
import fr.dta.sprinhibernate.company.CompanyTest;
import fr.dta.sprinhibernate.employee.EmployeeTest;
import fr.dta.sprinhibernate.mapping.UpdateMappingTest;

/**
 * @author Ayoub Benghal
 * 
 * 
 *
 *
 * 2017
 *
 *
 * AllTests.java
 */
@RunWith(Suite.class)
@SuiteClasses({EmployeeTest.class,AccountTest.class,CompanyTest.class,UpdateMappingTest.class})
public class AllTests {

}
