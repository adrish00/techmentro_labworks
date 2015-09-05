/**
 * 
 */
package org.techmentro.training.hibernate;
import java.util.Scanner;

import org.hibernate.*;
/**
 * @author Adrish
 *
 */
public class ConnectedUpdateClientCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Id:");
		int id = in.nextInt();
		in.nextLine();
		System.out.println("Loading Emp with Id: "+id);
		Session s = MyFactory.getSession();
		Emp emp = (Emp)s.get(Emp.class,id);
		System.out.println("Entity Current State:");
		System.out.println(emp.getName()+"\t"+emp.getJob()+"\t"+emp.getSalary());
		System.out.println("Enter Name:");
		String name= in.nextLine();
		System.out.println("Enter Job:");
		String job = in.nextLine();
		System.out.println("Enter Salary:");
		int salary = in.nextInt();
		
		Transaction t = s.beginTransaction();
		emp.setName(name);
		emp.setJob(job);
		emp.setSalary(salary);
		t.commit();
		in.close();
		s.close();
		System.out.println("Successfully updated");
	}

}
