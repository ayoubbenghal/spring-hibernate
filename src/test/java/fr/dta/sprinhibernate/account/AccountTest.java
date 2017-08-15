package fr.dta.sprinhibernate.account;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import fr.dta.springhibernate.account.model.Account;
import fr.dta.springhibernate.account.service.AccountService;
import fr.dta.sprinhibernate.AppTest;

/**
 * 
 */

/**
 * @author Ayoub Benghal
 * 
 * 
 *
 *
 * 2017
 *
 *
 * TestHibernate.java
 */
public class AccountTest extends AppTest{

	//private static AbstractApplicationContext context;
	private static AccountService accountService;
	private static Account a;
	private static List<Account>accounts;
	@BeforeClass
	public static void before() {
	//	context= new AnnotationConfigApplicationContext(App.class);
		accountService=(AccountService)AppTest.getInstance().getBean("acountMockService");
		a=new Account("ayoub");
		accounts=new ArrayList<>();
		accounts.add(new Account("imen"));
		accounts.add(new Account("rita"));
		accountService.truncate();
		
		
	}
	
	@Test
	public void Test1() {
		
		accountService.add(a);
	}
	@Test
	public void Test2() {
		a.setPassword("123456");
		accountService.updateType(a);
	}
	
	@Test
	public void Test3() {
		accountService.addList(accounts);
		
	}
	
	@Test 
	public void Test4() {
		assertTrue(accountService.getList().size()==3);
	}
	@Test
	public void Test5() {
		assertTrue(accountService.findByUserName("ayoub").equals(a));
	}
	

}
