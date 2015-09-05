package com.techmentro.training.spring.aopdemo;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class PostProcessing implements AfterReturningAdvice {

	public PostProcessing() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afterReturning(Object returnValue, Method m, Object[] args,
			Object target) throws Throwable {
		System.out.println("After advice is applied on "+m.getName()+" () method.");
		if(returnValue!=null){
			System.out.println(returnValue +" is return by method.");
			if(returnValue instanceof String){
				System.out.println("Chaning return value to failure");
				returnValue = "failure";
				System.out.println("returnValue is changed by the advice");
			}
			else{
				System.out.println("method return nothing");
			}
			System.out.println("After advice is completed");
		}
	}

}
