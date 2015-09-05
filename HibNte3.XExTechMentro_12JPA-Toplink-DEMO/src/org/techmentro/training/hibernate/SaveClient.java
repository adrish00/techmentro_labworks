package org.techmentro.training.hibernate;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.techmentro.training.hibernate.pojo.Emp;
public class SaveClient {

	public SaveClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Persistence  Objects....");
		Emp e1 = new Emp("Ammy_trainee_4","Trainee",5000);
		Emp e2 = new Emp("Ram_trainer_4","Trainer",45000);
		Emp e3 = new Emp("Udit_manager_4","Manager",65000);
		
		EntityManager m = MyFactory.getEntityManager();
		EntityTransaction t = m.getTransaction();
		t.begin();
		m.persist(e1);
		m.persist(e2);
		m.persist(e3);
		m.close();
		t.commit();
		System.out.println("Saved");
	}

}
