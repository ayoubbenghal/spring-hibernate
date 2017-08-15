/**
 * 
 */
package fr.dta.sprinhibernate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.dta.springhibernate.App;

/**
 * @author Ayoub Benghal
 * 
 * 
 *
 *
 * 2017
 *
 *
 * AppTest.java
 */
public class AppTest {
	private static AbstractApplicationContext context;
	
	
	public static AbstractApplicationContext getInstance() {
		if(context==null) {
			 context=new AnnotationConfigApplicationContext(App.class);
		}
		return context;
	}

	
}
