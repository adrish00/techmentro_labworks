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
public class DeleteClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Id:");
		int id = in.nextInt();
		in.nextLine();
		System.out.println("Delete EMp having Id:"+id);
		Session s = MyFactory.getSession();
		Emp emp = (Emp)s.load(Emp.class,id);
		Transaction t = s.beginTransaction();
		s.delete(emp);
		t.commit();
		s.close();
		System.out.println("Deleted..");
	}

}
