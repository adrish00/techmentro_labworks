/**
 * 
 */
package org.techmentro.training.spring.clientpack;

import org.springframework.beans.factory.BeanFactory;
import org.techmentro.training.spring.util.MyFactory;
//import org.techmentro.training.spring.beanpack.*;
import org.techmentro.training.spring.beanpack.Number;
/**
 * @author admin
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
		System.out.println("Requesting two number beans....");
		Number n1 = (Number)factory.getBean("num_complex");
		Number n2 = (Number)factory.getBean("num_complex");
		Number n4 = (Number)factory.getBean("num_rational");
		Number n5 = (Number)factory.getBean("num_rational");
		
		Number n3 = n1.add(n2);
		Number n6 = n4.add(n5);
		
		System.out.println("--Complex Show--------------------------");
		n1.display();
		n2.display();
		n3.display();
		System.out.println("--Rational Show--------------------------");
		n4.display();
		n5.display();
		n6.display();
	}

}
