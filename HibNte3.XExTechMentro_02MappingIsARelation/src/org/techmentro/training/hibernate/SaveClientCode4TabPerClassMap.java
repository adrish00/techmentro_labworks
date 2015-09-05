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
public class SaveClientCode4TabPerClassMap {
	public static void main(String args[]){
		System.out.println("Persistence Person Objects....");
		Person p = new Person("Armany John");
		Emp e = new Emp("Tommy Hil","Sr. Analyst",20000);
		Student st = new Student("StupidGuy BadBoy","Java",5000);
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
