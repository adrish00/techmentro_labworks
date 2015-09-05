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
public class GetLoadPlayClientCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Id:");
		int id = in.nextInt();
		in.close();
		System.out.println("Loading Emp with Id: "+id);
		Session s = MyFactory.getSession();
		Emp emp= (Emp)s.get(Emp.class, id);
		//Emp emp= (Emp)s.load(Emp.class, id);
		System.out.println("Entity Loaded");
		System.out.println("Entity State:");
		System.out.print(emp.getName()+"\t"+emp.getJob()+"\t"+emp.getSalary());
		s.close();
	}
}
