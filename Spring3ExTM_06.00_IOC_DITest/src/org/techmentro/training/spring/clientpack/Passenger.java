package org.techmentro.training.spring.clientpack;

import org.springframework.beans.factory.BeanFactory;
import org.techmentro.training.spring.beanpack.Conductor;
import org.techmentro.training.spring.beanpack.Ticket;
import org.techmentro.training.spring.util.MyFactory;

public class Passenger {

	public Passenger() {
		
	}
	public static void main(String args[]){
		BeanFactory factory = MyFactory.getBeanFactory();
		System.out.println("Requesting conductor bean");
		Conductor cr = (Conductor)factory.getBean("c");
		System.out.println("class "+cr.getClass().getName());
		System.out.println("Requesting two tickets from conductor:");
		Ticket t1 = cr.getTicket();
		Ticket t2 = cr.getTicket();
		System.out.println("Description of First ticket");
		t1.show();
		System.out.println("Description of Second ticket");
		t2.show();
	}
}
