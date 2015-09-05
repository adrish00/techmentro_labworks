package com.techmentro.training.spring.aopdemo;

import org.springframework.beans.factory.BeanFactory;

public class IocUser {

	public IocUser() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BeanFactory factory = MyFactory.getBeanFactory();
		System.out.println("Requesting Proxy");
		ABC proxy = (ABC) factory.getBean("proxy");
		System.out.println("invoking a() on proxy");
		proxy.a();
		System.out.println("invoking b() on proxy");
		String str = proxy.b();
		System.out.println("b() retruned "+str+" in main");
		System.out.println("invoking c(int,int) on proxy");
		try{
		//int d = proxy.c(5,2);
		int d = proxy.c(5,0);
		System.out.println("c() returned "+d+" in main");
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
