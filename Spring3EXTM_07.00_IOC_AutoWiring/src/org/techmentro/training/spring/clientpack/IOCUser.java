/**
 * 
 */
package org.techmentro.training.spring.clientpack;


import org.springframework.beans.factory.BeanFactory;
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
		BeanFactory factory = MyFactory.getBeanFactory();
		System.out.println("Requesting  beans....");
		
		A a = (A)factory.getBean("a");
		B b = a.getB();
		
		System.out.println("B name "+b.getName());
	}

}
