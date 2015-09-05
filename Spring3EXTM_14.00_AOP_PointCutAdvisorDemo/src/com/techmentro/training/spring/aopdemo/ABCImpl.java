package com.techmentro.training.spring.aopdemo;

public class ABCImpl implements ABC {

	public ABCImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void a() {
		System.out.println("a() of target is invoked");
	}

	@Override
	public String b() {
		System.out.println("b() of target is invoked. returning sussess");
		return "success";
	}

	@Override
	public int c(int x, int y) throws Exception {
		System.out.println("c(int,int) of target is invoked");
		if(y!=0){
			System.out.println("c() is returning normally.");
		}
		else{
			System.out.println("c() is throwing ArithmeticException.");
		}
		return x/y;
	}

}
