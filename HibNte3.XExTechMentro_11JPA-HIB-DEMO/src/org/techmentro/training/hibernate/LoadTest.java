/**
 * 
 */
package org.techmentro.training.hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;

import org.techmentro.training.hibernate.pojo.Emp;

/**
 * @author Adrish
 *
 */
public class LoadTest {

	/**
	 * 
	 */
	public LoadTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Id:");
		int id = in.nextInt();
		in.close();
		System.out.println("Loading Emp having Id: "+id);
		EntityManager m = MyFactory.getEntityManager();
		Emp e = (Emp)m.find(Emp.class, id);
		//Emp e = (Emp)m.getReference (Emp.class, id);
		System.out.println("Entity Loaded..");
		System.out.println("Entity State - ");
		System.out.println(e.getName()+"\t"+e.getSalary()+"\t"+e.getJob());
		m.close();
	}

}
