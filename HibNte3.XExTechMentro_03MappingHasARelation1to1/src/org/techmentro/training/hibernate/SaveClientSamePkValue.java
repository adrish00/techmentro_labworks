/**
 * 
 */
package org.techmentro.training.hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.techmentro.training.hibernate.pojo.*;

/**
 * @author Adrish
 *
 */
public class SaveClientSamePkValue {
	public static void main(String args[]){
		System.out.println("Persistence Country Objects....");
		Country ind = new Country("India",new HeadOfState("President","P. Mukherjee"));
		Country uk 	= new Country("UK",new HeadOfState("Queen","Elizabeth II"));
		Country usa = new Country("USA",new HeadOfState("President","B. Obama"));
		Session s = MyFactory.getSession();
		Transaction t = s.beginTransaction();
		s.save(ind);
		s.save(uk);
		s.save(usa);
		t.commit();
		s.close();
		System.out.println("Saved");
	}
}
