/**
 * 
 */
package org.techmentro.training.hibernate;

import org.hibernate.*;
/**
 * @author Adrish
 *
 */
public class RefreshClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("mainThread started loading entity with Id");
		Session s = MyFactory.getSession();
		Emp emp= (Emp)s.get(Emp.class, 1);
		System.out.println("Entity Loaded. starting new Thread..");
		Thread th = new Thread(){
			public void run(){
				System.out.println("new Thread started...");
				System.out.println("updating entity with ID:1");
				Session s = MyFactory.getSession();
				Emp emp= (Emp)s.get(Emp.class, 1);
				Transaction t = s.beginTransaction();
				emp.setName("Adrish");
				emp.setJob("Sr Software Engineer");
				emp.setSalary(50000);
				t.commit();
				s.close();
				System.out.println("Entity updated.NewThread Completed");
			}
		};
		th.start();
		System.out.println("suspending main thread..");
		try{
			Thread.sleep(2000);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		s.refresh(emp);
		System.out.println("Refreshed");
		System.out.println("Entity Current State:");
		System.out.println(emp.getName()+"\t"+emp.getJob()+"\t"+emp.getSalary());
		s.close();
		System.out.println("Main Thread completed..");
		
	}
 
}
