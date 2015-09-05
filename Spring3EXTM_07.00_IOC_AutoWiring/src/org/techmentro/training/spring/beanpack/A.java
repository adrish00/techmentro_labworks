package org.techmentro.training.spring.beanpack;

public class A {
	B b;
	/**
	 * @return the b
	 */
	public B getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(B b) {
		this.b = b;
		System.out.println(b.getName()+ " is injected");
	}
	/**
	 * @param b
	 */
	public A(B b) {
		this.b = b;
		System.out.println("A is created and "+b.getName()+" is injected");
	}
	public A() {
		System.out.println("A is created");
	}

}
