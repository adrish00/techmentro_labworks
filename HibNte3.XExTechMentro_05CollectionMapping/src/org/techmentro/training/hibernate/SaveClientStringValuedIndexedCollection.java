package org.techmentro.training.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.techmentro.training.hibernate.pojo.Course;
import java.util.List;
import java.util.ArrayList;
public class SaveClientStringValuedIndexedCollection {

	public SaveClientStringValuedIndexedCollection() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Persistence  Objects....");
		List<String> topics = new ArrayList<String> ();
		topics.add("Struts 2.x Introduction");
		topics.add("Struts 2.x MVC FRAMEWORK");
		topics.add("Struts 2.x MVC ARCH");
		Course struts = new Course("Struts 2.x",4000,topics);
		topics.clear();
		topics.add("Spring IOC");
		topics.add("Spring AOP");
		topics.add("Spring MVC");
		Course spring 	= new Course("Spring 2",4000,topics); 
		topics.clear();
		topics.add("Hibernate Arch");
		topics.add("Hibernate Common Methods");
		topics.add("Hibernate Mapping");
		Course hibernate = new Course("Hibernate 3",4000,topics); 
		Session s = MyFactory.getSession();
		Transaction t = s.beginTransaction();
		s.save(struts);
		s.save(spring);
		s.save(hibernate);
		t.commit();
		s.close();
		System.out.println("Saved");
	}

}
