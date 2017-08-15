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
 * ayoub.benghal@gmail.com
 *
 *
 * mvn -Dtest=AllTests test pour un Single Test Run
 * 
 * Teste Directement dans la base de données 
 * 
 * Le classement des tests est important pour ne pas violer les contraintes des clés étrangéres
 * 
 * 
 * 
 * 2017
 */
@RunWith(Suite.class)
@SuiteClasses({EmployeeTest.class,AccountTest.class,CompanyTest.class,UpdateMappingTest.class})
public class AllTests {

}
