/**
 * 
 */
package org.techmentro.training.hibernate;
import org.hibernate.Session;
import org.techmentro.training.hibernate.pojo.*;
import java.util.Scanner;
/**
 * @author Adrish
 *
 */
public class LoadClientToCheckBidirection {

	/**
	 * 
	 */
	public LoadClientToCheckBidirection() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter countryId:");
		int id = in.nextInt();
		Session s = MyFactory.getSession();
		Country country = (Country)s.get(Country.class, id);
		System.out.println("Country - "+country.getName());
		HeadOfState hos = country.getHos();
		System.out.println("HOS Details:");
		System.out.println(""+hos.getTitle()+"\t"+hos.getName()+"\t");
		System.out.println("------------\nEnter HOSId:");
		id = in.nextInt();
		HeadOfState ho = (HeadOfState) s.get(HeadOfState.class, id);
		System.out.println("HOS Details:");
		System.out.println(""+ho.getTitle()+"\t"+ho.getName()+"\t");
		Country c = ho.getCountry();
		System.out.println("Country is:"+c.getName());
		in.close();
		s.close();
		
	}

}
