package org.techmentro.training.spring.beanpack;

public class Ticket {
	static int counter;
	int no;
	public Ticket() {
		no = ++counter;
		System.out.println("Ticket no "+ no +" is created");
	}
	public void show(){
		System.out.println("It is ticket no "+no);
	}
}
