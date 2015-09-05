/**
 * 
 */
package org.techmentro.training.spring.clientpack;

//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.techmentro.training.spring.beanpack.B;
import org.techmentro.training.spring.util.MyFactory;
//import org.techmentro.training.spring.beanpack.*;

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
		try{
		ApplicationContext appCtx = MyFactory.getApplicationContext();
		//System.out.println("Application started");
		//System.out.println("Requesting two Beans");
		B b1 = (B)appCtx.getBean("b1");
		B b2 = (B)appCtx.getBean("b2");
		System.out.println("B1 details "+b1.getName());
		System.out.println("B2 details "+b2.getName());
		
		
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
