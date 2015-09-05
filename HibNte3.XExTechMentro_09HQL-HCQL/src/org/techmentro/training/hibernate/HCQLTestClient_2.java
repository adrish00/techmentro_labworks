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
import org.techmentro.training.hibernate.pojo.Previlige;

public class HCQLTestClient_2 {
	public static void main(String args[]){
		Scanner in = new Scanner (System.in);
		Session s = MyFactory.getSession();
		Criteria c = s.createCriteria(Previlige.class);
		c.setProjection(Projections.property("name"));
		List<String> list = c.list();
		System.out.println("Following previliges are loaded:");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			String p = itr.next();
			System.out.println(p);
		}
		s.close();
	}
}
