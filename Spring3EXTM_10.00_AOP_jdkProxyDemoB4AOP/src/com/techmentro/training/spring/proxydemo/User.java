package com.techmentro.training.spring.proxydemo;

import java.lang.reflect.Proxy;

public class User {

	public User() {
		
	}

	public static void main(String[] args) {
		//Creating target object
		A target = new A();
		//Creating Handler
		PrintHandler handler  = new PrintHandler(target);
		//Creating proxy
		Printable proxy = (Printable) Proxy.newProxyInstance(target.getClass().getClassLoader(),
															target.getClass().getInterfaces(),
															handler);
		System.out.println("Invoking print() on proxy");
		proxy.print();
	}

}
