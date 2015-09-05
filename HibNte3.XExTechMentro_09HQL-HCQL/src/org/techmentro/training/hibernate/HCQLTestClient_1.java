package org.techmentro.training.hibernate;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.techmentro.training.hibernate.pojo.Emp;

public class HCQLTestClient_1 {
	public static void main(String args[]){
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter previlige count:");
		int pc = in.nextInt();
		in.close();
		Session s = MyFactory.getSession();
		Criteria c = s.createCriteria(Emp.class);
		c.add(Restrictions.sizeGe("previliges", pc));
		
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.property("name"));
		plist.add(Projections.property("job"));
		c.setProjection(plist);
		
		List<Object[]> list = c.list();
		System.out.println("Following employee objects are loaded..");
		Iterator<Object[]> itr = list.iterator();
		while(itr.hasNext()){
			Object e[] = itr.next();
			System.out.println(e[0]+"\t"+e[1]);
		}
		s.close();
	}
}
