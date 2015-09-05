/**
 * 
 */
package org.techmentro.training.hibernate;
import org.hibernate.*;
import org.hibernate.cfg.*;
/**
 * @author Adrish
 *
 */
public class MyFactory {
	static SessionFactory factory;
	static{
		Configuration cfg = new Configuration().configure();
		factory = cfg.buildSessionFactory();
	}
	public static Session getSession(){
		return factory.openSession();
	}
	public static SessionFactory getSessionFactory(){
		return factory;
	}
}
