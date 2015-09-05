/**
 * 
 */
package org.techmentro.training.hibernate;
import org.hibernate.Session;
import org.techmentro.training.hibernate.pojo.Batch;
import org.techmentro.training.hibernate.pojo.Trainer;
import java.util.*;
/**
 * @author Adrish
 *
 */
public class SelectTestBirDirection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Trainer Id:");
		int id = in.nextInt();
		
		Session s = MyFactory.getSession();
		Trainer tr = (Trainer)s.get(Trainer.class, id);
		
		System.out.println("Trainer Name:"+tr.getName());
		Set <Batch> set = tr.getBatches();
		System.out.println("Batch Details:");
		
		Iterator<Batch> itr = set.iterator();
		while(itr.hasNext()){
			Batch b = itr.next();
			System.out.println(b.getId()+"\t"+b.getSlot()+"\t"+b.getTopic());
		}
		System.out.println("----------------------------------------");
		System.out.println("Enter Batch Id:");
		id = in.nextInt();
		Batch batch = (Batch)s.get(Batch.class, id);
		System.out.println("Batch Details:");
		System.out.println(batch.getId()+"\t"+batch.getSlot()+"\t"+batch.getTopic());
		Trainer t = batch.getTrainer();
		System.out.println("Trainer nam:"+t.getName());
		s.close();
	}

}
