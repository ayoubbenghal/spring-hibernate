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
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * Recuperation d'une instance unique de {@link AbstractApplicationContext} puisqu'elle est utilisée
 * par plusieurs tests
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
