package org.techmentro.training.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.techmentro.training.hibernate.pojo.Emp;
import org.techmentro.training.hibernate.pojo.Previlige;
import java.util.Set;
import java.util.HashSet;
public class SaveClientManyToMany {

	public SaveClientManyToMany() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Persistence  Objects....");
		
		Previlige p1 = new Previlige("Car",60000);
		Previlige p2 = new Previlige("Flat",300000);
		Previlige p3 = new Previlige("Foreign Tour",600000);
		
		Set<Previlige> s1 = new HashSet<Previlige>();
		Set<Previlige> s2 = new HashSet<Previlige>();
		Set<Previlige> s3 = new HashSet<Previlige>();
		
		s1.add(p1);
		s1.add(p2);
		s1.add(p3);
		
		s2.add(p1);
		s2.add(p2);
		
		s3.add(p1);
		
		Emp  e1 = new Emp("Vipul", "COO",100000 ,s1);
		Emp  e2 = new Emp("Nitin", "Sr. Technical Manager",50000, s2);
		Emp  e3 = new Emp("Rani", "Technical Manager", 35000,s3);
		
		
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
