package org.techmentro.training.spring.factory;

import java.util.Scanner;

import org.springframework.beans.factory.FactoryBean;
import org.techmentro.training.spring.beanpack.Complex;
import org.techmentro.training.spring.beanpack.Number;
import org.techmentro.training.spring.beanpack.Rational;

public class NumberFactory implements FactoryBean<Number>{
	private String type;
	public NumberFactory() {
		// TODO Auto-generated constructor stub
	}
	public NumberFactory(String t) {
		type = t;
		System.out.println("Factory created....");
	}
	/*//different class non static factory method
	public Number getNumber(){
		if(type.equalsIgnoreCase("complex")){
			return getComplex();
		}
		else if (type.equalsIgnoreCase("rational")){
			return getRational();
		}
		else{
			return null;
		}
	}*/
	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#getObject()
	 */
	@Override
	public Number getObject() throws Exception {
		if(type.equalsIgnoreCase("complex")){
			return getComplex();
		}
		else if (type.equalsIgnoreCase("rational")){
			return getRational();
		}
		else{
			return null;
		}
	}
	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#getObjectType()
	 */
	@Override
	public Class<Number> getObjectType() {
		// TODO Auto-generated method stub
		return Number.class;
	}
	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#isSingleton()
	 */
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * returns Complex Object	
	 * @return
	 */
	private  Number getComplex(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Real part:");
		int r = in.nextInt();
		System.out.println("Enter Imaginary part:");
		int i = in.nextInt();
		return new Complex(r,i);
	}
	/**
	 * returns Rational Object
	 * @return
	 */
	private Number getRational(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter p");
		int p = in.nextInt();
		System.out.println("Enter q");
		int q = in.nextInt();
		return new Rational(p,q);
	}
}
