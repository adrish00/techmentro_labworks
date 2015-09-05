/**
 * 
 */
package org.techmentro.training.hibernate;
import java.util.Scanner;

//i2
import org.techmentro.training.hibernate.dao.EmpDao;
/**
 * @author Adrish
 *
 */
public class DisconnectedUpdate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Id:");
		int id = in.nextInt();
		in.nextLine();
		System.out.println("Loading EMp having Id:"+id);
		EmpDao dao = new EmpDao();
		Emp emp = dao.getById(id);
		
		System.out.println("Entity Current State:");
		System.out.println(emp.getName()+"\t"+emp.getJob()+"\t"+emp.getSalary());
		
		System.out.println("Enter Name:");
		String name= in.nextLine();
		System.out.println("Enter Job:");
		String job = in.nextLine();
		System.out.println("Enter Salary:");
		int salary = in.nextInt();
		
		emp.setName(name);
		emp.setJob(job);
		emp.setSalary(salary);
		
		in.close();
		dao.update(emp);
	}

}
