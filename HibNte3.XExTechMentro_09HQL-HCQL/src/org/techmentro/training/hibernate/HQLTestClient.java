package org.techmentro.training.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLTestClient {
	public static void main(String args[]){
		Session s = MyFactory.getSession();
		Query q = s.createQuery("select e.name,e.job from Emp e where size(e.previliges) >=2");
		List< Object[]> list = q.list();
		Iterator<Object[]> itr = list.iterator();
		while(itr.hasNext()){
			Object cols[] = itr.next();
			System.out.println(cols[0]+"\t"+cols[1]);
		}
		s.close();
	}
}
