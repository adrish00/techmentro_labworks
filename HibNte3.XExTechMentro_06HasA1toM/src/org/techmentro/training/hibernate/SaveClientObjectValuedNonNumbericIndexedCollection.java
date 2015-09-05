package org.techmentro.training.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.techmentro.training.hibernate.pojo.Project;
import org.techmentro.training.hibernate.pojo.ProjectManager;
import java.util.Map;
import java.util.HashMap;
public class SaveClientObjectValuedNonNumbericIndexedCollection {

	public SaveClientObjectValuedNonNumbericIndexedCollection() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Persistence Country Objects....");
		Project a = new Project("A Sys Pro",20);
		Project b = new Project("B solutioning",30);
		Project c = new Project("C cracks",10);
		Project d = new Project("D Info Beta",80);
		
		Map <String,Project> pm_1_projs= new HashMap<String,Project> ();
		pm_1_projs.put("XYZ Inc.", a);
		pm_1_projs.put("PQR LLC.", b);
		
		Map <String,Project> pm_2_projs= new HashMap<String,Project> ();
		pm_2_projs.put("ABC Ltd.", c);
		pm_2_projs.put("MNP PVT LTD.", d);
		
		ProjectManager pm_1 = new ProjectManager("Adrish",pm_1_projs);
		ProjectManager pm_2 = new ProjectManager("Naved",pm_2_projs);
		
		
		Session s = MyFactory.getSession();
		Transaction t = s.beginTransaction();
		s.save(pm_1);
		s.save(pm_2);
		
		t.commit();
		s.close();
		System.out.println("Saved");
	}

}
