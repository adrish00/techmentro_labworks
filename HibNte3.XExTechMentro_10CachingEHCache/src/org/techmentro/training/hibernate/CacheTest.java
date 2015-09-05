package org.techmentro.training.hibernate;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.stat.SecondLevelCacheStatistics;
import org.techmentro.training.hibernate.pojo.Emp;
import org.techmentro.training.hibernate.pojo.Previlige;;

public class CacheTest {

	public static void main(String[] args) {
		try{
		SessionFactory f = MyFactory.getSessionFactory();
		for(int i =0;i<=2;i++){
			Session s = MyFactory.getSession();
			long t1= System.currentTimeMillis();
			Emp e = (Emp) s.get(Emp.class, 13);
			Set<Previlige> set = e.getPreviliges();
			long t2 = System.currentTimeMillis();
			long t = t2-t1;
			System.out.println("query took "+t+" milliSecs on"+i+" th time" );
			System.out.println("fetched Emp details");
			System.out.println(e.getName()+"\t"+e.getJob()+"\t"+e.getSalary()+"\t");
			Iterator<Previlige> itr = set.iterator();
			while(itr.hasNext()){
				Previlige p = itr.next();
				System.out.println("\t"+p.getId()+"\t"+p.getName()+"\t"+p.getAnnualCost());
			}
			s.close();
			SecondLevelCacheStatistics sts1 = f.getStatistics().getSecondLevelCacheStatistics("org.techmentro.training.hibernate.pojo.Emp");
			System.out.println("Details of Emp cache region:");
			System.out.println(sts1);
			SecondLevelCacheStatistics sts2 = f.getStatistics().getSecondLevelCacheStatistics("org.techmentro.training.hibernate.pojo.Previlige");
			System.out.println("Details of Emp cache region:");
			System.out.println(sts2);
		}
		
		}
		catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
