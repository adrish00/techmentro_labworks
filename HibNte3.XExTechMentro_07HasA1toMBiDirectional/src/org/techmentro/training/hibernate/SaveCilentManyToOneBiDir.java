package org.techmentro.training.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.techmentro.training.hibernate.pojo.Batch;
import org.techmentro.training.hibernate.pojo.Trainer;


public class SaveCilentManyToOneBiDir {

	public SaveCilentManyToOneBiDir() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Persistence  Objects....");
		
		Trainer javaTrainer = new Trainer("Adrish ......");
		Trainer dotNetTrainer = new Trainer("Ayon ......");
		
		Batch spr = new Batch("8-10","Spring",javaTrainer);
		Batch str = new Batch("3-6","Struts",javaTrainer);
		Batch grv = new Batch("12-2","Groovy & Grail",javaTrainer);
		
		Batch csh = new Batch("9-12","C#",dotNetTrainer);
		Batch asp_net = new Batch("12-2","ASP.NET",dotNetTrainer);
		Batch vb_net = new Batch("12-2","ASP.NET",dotNetTrainer);
		
		
		Session s = MyFactory.getSession();
		Transaction t = s.beginTransaction();
		s.save(spr);
		s.save(str);
		s.save(grv);
		s.save(csh);
		s.save(asp_net);
		s.save(vb_net);
		
		t.commit();
		s.close();
		System.out.println("Saved");
	}

}
