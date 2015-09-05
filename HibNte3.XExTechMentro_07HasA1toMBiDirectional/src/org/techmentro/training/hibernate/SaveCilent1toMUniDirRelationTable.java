package org.techmentro.training.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.techmentro.training.hibernate.pojo.Batch;
import org.techmentro.training.hibernate.pojo.Trainer;
import java.util.Set;
import java.util.HashSet;
public class SaveCilent1toMUniDirRelationTable {

	public SaveCilent1toMUniDirRelationTable() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Persistence  Objects....");
		Batch spr = new Batch("8-10","Spring");
		Batch str = new Batch("3-6","Struts");
		Batch csh = new Batch("9-12","C#");
		Batch asp_net = new Batch("12-2","ASP.NET");
		
		Set <Batch> javabatches= new HashSet<Batch> ();
		javabatches.add(spr);
		javabatches.add(str);
		
		Set <Batch> dotnetbatches= new HashSet<Batch> ();
		dotnetbatches.add(csh);
		dotnetbatches.add(asp_net);
		
		Trainer javaTrainer = new Trainer("Adrish Bhattacharyay", javabatches);
		Trainer dotNetTrainer = new Trainer("Naved Khan", dotnetbatches);
		
		
		Session s = MyFactory.getSession();
		Transaction t = s.beginTransaction();
		s.save(javaTrainer);
		s.save(dotNetTrainer);
		
		t.commit();
		s.close();
		System.out.println("Saved");
	}

}
