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
public class SaveClientCode4JoinedTabMap {
	public static void main(String args[]){
		System.out.println("Persistence Person Objects....");
		Person p = new Person("Amit");
		Emp e = new Emp("Roman","Sr. Analyst",20000);
		Student st = new Student("Aditya","Java",5000);
		Session s = MyFactory.getSession();
		Transaction t = s.beginTransaction();
		s.save(p);
		s.save(e);
		s.save(st);
		t.commit();
		s.close();
		System.out.println("Saved");
	}
}
