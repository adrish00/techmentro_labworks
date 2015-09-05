/**
 * 
 */
package org.techmentro.training.hibernate.dao;
import org.techmentro.training.hibernate.*;
import org.hibernate.*;
/**
 * @author admin
 *
 */
public class EmpDao {
	public Emp getById(int id){
		Session s = MyFactory.getSession();
		Emp e = (Emp) s.get(Emp.class,id);
		s.close();
		return e;
	}
	public void update(Emp e){
		Session s = MyFactory.getSession();
		Transaction t = s.beginTransaction();
		s.merge(e);
		t.commit();
	}
}
