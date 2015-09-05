/**
 * 
 */
package org.techmentro.training.spring.clientpack;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.techmentro.training.spring.util.MyFactory;
import org.techmentro.training.spring.beanpack.*;

/**
 * @author Adrish
 *
 */
public class IOCUser {

	/**
	 * 
	 */
	public IOCUser() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		XmlBeanFactory factory = (XmlBeanFactory)MyFactory.getBeanFactory();
		System.out.println("Application started");
		System.out.println("Requesting two Beans");
		
		B b1 = (B) factory.getBean("b1");
		B b2 = (B) factory.getBean("b2");
		b1.getName();
		b2.getName();
		System.out.println("Getting Beans removed");
		//factory.destroySingleton("b1");
		//factory.destroySingleton("b2");
		factory.destroySingletons();
	}

}
