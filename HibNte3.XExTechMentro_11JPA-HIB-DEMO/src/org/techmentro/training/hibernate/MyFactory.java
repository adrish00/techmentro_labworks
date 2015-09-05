/**
 * 
 */
package org.techmentro.training.hibernate;
import javax.persistence.*;
/**
 * @author Adrish
 *
 */
public class MyFactory {
	static EntityManagerFactory factory;
	static{
		factory = Persistence.createEntityManagerFactory("basic");
	}
	public static EntityManager getEntityManager(){
		return factory.createEntityManager();
	}
}
