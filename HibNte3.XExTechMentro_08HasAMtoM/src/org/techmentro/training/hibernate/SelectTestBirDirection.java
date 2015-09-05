/**
 * 
 */
package org.techmentro.training.hibernate;
import org.hibernate.Session;
import org.techmentro.training.hibernate.pojo.Emp;
import org.techmentro.training.hibernate.pojo.Previlige;
import java.util.*;
/**
 * @author Adrish
 *
 */
public class SelectTestBirDirection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner (System.in);
			System.out.println("Enter EmpId:");
			int id = in.nextInt();
			Session s = MyFactory.getSession();
			Emp e = (Emp) s.get(Emp.class, id);
			System.out.println("Emp Details:");
			System.out.println(e.getName()+"\t"+e.getJob()+"\t"+e.getSalary()+"\t");
			Set<Previlige> set = e.getPreviliges();
			System.out.println("Available previliges:");
			Iterator<Previlige> itr = set.iterator();
			while(itr.hasNext()){
				Previlige p = itr.next();
				System.out.println("\t"+p.getId()+"\t"+p.getName()+"\t"+p.getAnnualCost());
			}
			System.out.println("------------------------------------");
			System.out.println("Enter previlige id:");
			id = in.nextInt();
			Previlige pr = (Previlige) s.get(Previlige.class, id);
			System.out.println("Previlige details:");
			System.out.println("\t"+pr.getId()+"\t"+pr.getName()+"\t"+pr.getAnnualCost());
			Set <Emp> eSet = pr.getEmployees();
			System.out.println("This previlige is availaed by below employees:");
			Iterator<Emp> eItr = eSet.iterator(); 
			while(eItr.hasNext()){
				Emp emp= eItr.next();
				System.out.println(emp.getName()+"\t"+emp.getJob()+"\t"+emp.getSalary()+"\t");
			}
		}
}

