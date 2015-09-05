package org.techmentro.training.hibernate;

import org.hibernate.*;

/**
 * @author Adrish
 *
 */
public class SaveClientCode {
	public static void main(String args[]){
		System.out.println("Persistence Employee Object");
		Emp e1 = new Emp("Amit","Trainee",5000);
		Emp e2 = new Emp("Roman","Trainee",4500);
		Emp e3 = new Emp("Aditya","Manager",5000);
		Session s = MyFactory.getSession();
		Transaction t = s.beginTransaction();
		s.save(e1);
		s.save(e2);
		s.save(e3);
		t.commit();
		s.close();
		System.out.println("Saved");
	}
}
