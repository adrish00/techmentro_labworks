/**
 * 
 */
package org.techmentro.training.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author admin
 *
 */
public class MyFactory {

	/**
	 * 
	 */
	public MyFactory() {
		// TODO Auto-generated constructor stub
	}
	static ApplicationContext ctx;
	static {
		//Resource r = new ClassPathResource("applicationContext.xml");
		//factory = new XmlBeanFactory(r);
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	}
	public static ApplicationContext getApplicationContext(){
		return ctx;
	}
}
