package org.techmentro.training.spring.factory;

import java.util.Scanner;

import org.techmentro.training.spring.beanpack.Complex;
import org.techmentro.training.spring.beanpack.Number;
import org.techmentro.training.spring.beanpack.Rational;

public class NumberFactory {

	public NumberFactory() {
		// TODO Auto-generated constructor stub
	}
	//diff class static factory method
	public static Number getComplex(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Real part:");
		int r = in.nextInt();
		System.out.println("Enter Imaginary part:");
		int i = in.nextInt();
		return new Complex(r,i);
	}
	//diff class static factory method
	public static Number getRational(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter p");
		int p = in.nextInt();
		System.out.println("Enter q");
		int q = in.nextInt();
		return new Rational(p,q);
	}
}
