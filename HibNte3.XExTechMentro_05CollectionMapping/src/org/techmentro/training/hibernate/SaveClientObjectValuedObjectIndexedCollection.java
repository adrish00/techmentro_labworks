package org.techmentro.training.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.techmentro.training.hibernate.pojo.Project;
import org.techmentro.training.hibernate.pojo.ProjManager;
import org.techmentro.training.hibernate.pojo.Client;
import java.util.Map;
import java.util.HashMap;
public class SaveClientObjectValuedObjectIndexedCollection {

	public SaveClientObjectValuedObjectIndexedCollection() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Persistence Country Objects....");
		Project a = new Project("Insite Anywhere",20);
		Project b = new Project("BP PetroGasDataManagement.",30);
		Project c = new Project("Vodafone Telecom Fraud Management.",10);
		Project d = new Project("Quintiq - supply chain planning system",80);
		Project e = new Project("BattleRed - HDF",20);
		Project f = new Project("Airtel Fraud Control System.",10);
		
		Client c1 = new Client("HES Inc.", "USA");
		Client c2 = new Client("BP", "UK");
		
		Client c3 = new Client("Vodafone India","India");
		Client c4 = new Client("Quater Gas LLC.","Quatar");
		Client c5 = new Client("Bharti Airtel","India");
		
		Map <Client,Project> enu_projs= new HashMap<Client,Project> ();
		enu_projs.put(c1, a);
		enu_projs.put(c2, b);
		enu_projs.put(c1, e);
		enu_projs.put(c4, d);
		
		Map <Client,Project> telecom_projs= new HashMap<Client,Project> ();
		telecom_projs.put(c3, c);
		telecom_projs.put(c5, f);
		
		ProjManager enuPm 	  = new ProjManager("Adrish",enu_projs);
		ProjManager telecomPm = new ProjManager("Naved",telecom_projs);
		
		
		Session s = MyFactory.getSession();
		Transaction t = s.beginTransaction();
		//Need to save client objects explicitly as ternary relation will not be handled by hibernate in this case.
		s.save(c1);
		s.save(c2);
		s.save(c3);
		s.save(c4);
		s.save(c5);
		
		s.save(enuPm);
		s.save(telecomPm);
		
		t.commit();
		s.close();
		System.out.println("Saved");
	}

}
